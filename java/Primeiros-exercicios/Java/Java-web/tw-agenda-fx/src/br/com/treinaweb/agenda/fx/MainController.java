package br.com.treinaweb.agenda.fx;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.repositorios.impl.RepositorioContato;
import br.com.treinaweb.agenda.repositorios.impl.RepositorioContatoJdbc;
import br.com.treinaweb.agenda.repositorios.interfaces.RepositorioAgenda;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

	@FXML
	private TableView<Contato> tabelaContatos;
	@FXML
	private Button btnInsert;
	@FXML
	private Button btnUpdate;
	@FXML
	private Button btnDelete;
	@FXML
	private Button btnSava;
	@FXML
	private Button btnCancel;
	@FXML
	private TextField txfNome;
	@FXML
	private TextField txfIdade;
	@FXML
	private TextField txfEmail;
	@FXML
	private TextField txfTelefone;
	private Boolean isInsert;
	private Contato contatoSelecionado;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.tabelaContatos.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		habilitarEditAgenda(false);
		/*
		 * this.tabelaContatos.getSelectionModel().selectedItemProperty().addListener(
		 * new ChangeListener<Contato>() {
		 * 
		 * @Override public void changed(ObservableValue<? extends Contato> observable,
		 * Contato oldValue, Contato newValue) { if (newValue != null) {
		 * txfNome.setText(newValue.getNome());
		 * txfIdade.setText(String.valueOf(newValue.getIdade()));
		 * txfEmail.setText(newValue.getEmail());
		 * txfTelefone.setText(newValue.getTelefone()); } } });
		 */
		this.tabelaContatos.getSelectionModel().selectedItemProperty()
				.addListener((observador, contatoAntigo, contatoNovo) -> {
					if (contatoNovo != null) {
						txfNome.setText(contatoNovo.getNome());
						txfIdade.setText(String.valueOf(contatoNovo.getIdade()));
						txfEmail.setText(contatoNovo.getEmail());
						txfTelefone.setText(contatoNovo.getTelefone());
						this.contatoSelecionado = contatoNovo;
					}
				});
		carregarTabelaContato();
	}

	public void btnInsert_Action() {
		this.isInsert = true;
		this.txfNome.setText("");
		this.txfIdade.setText("");
		this.txfEmail.setText("");
		this.txfTelefone.setText("");
		habilitarEditAgenda(true);
	}

	public void btnUpdate_Action() {
		habilitarEditAgenda(true);
		this.isInsert = false;
		this.txfNome.setText(this.contatoSelecionado.getNome());
		this.txfIdade.setText(Integer.toString(this.contatoSelecionado.getIdade()));
		this.txfEmail.setText(this.contatoSelecionado.getEmail());
		this.txfTelefone.setText(this.contatoSelecionado.getTelefone());
	}

	public void btnCancel_Action() {
		habilitarEditAgenda(true);
		this.tabelaContatos.getSelectionModel().selectFirst();
	}

	public void btnSave_Action() {
		try {
			RepositorioAgenda<Contato> repositorioContato = new RepositorioContatoJdbc();
			Contato contato = new Contato();
			contato.setNome(txfNome.getText());
			contato.setIdade(Integer.parseInt(txfIdade.getText()));
			contato.setEmail(txfEmail.getText());
			contato.setTelefone(txfTelefone.getText());
			if (this.isInsert) {
				repositorioContato.inserir(contato);
			} else {
				repositorioContato.atualizar(contato);
			}
			habilitarEditAgenda(false);
			carregarTabelaContato();
			this.tabelaContatos.getSelectionModel().selectFirst();
		} catch (Exception e) {
			Alert mensagem = new Alert(AlertType.ERROR);
			mensagem.setTitle("ERRO");
			mensagem.setHeaderText("Erro no banco de dados");
			mensagem.setContentText("Não conectado: " + e.getMessage());
			mensagem.showAndWait();
		}
	}

	public void btnDelete_Action() {
		Alert confirmacao = new Alert(AlertType.CONFIRMATION);
		confirmacao.setTitle("Confirmação");
		confirmacao.setHeaderText("Confirmação da exclusão do contato");
		confirmacao.setContentText("Tem certeza de que deseja excluir este contato?");
		Optional<ButtonType> resultadoConfirmacao = confirmacao.showAndWait();
		if (resultadoConfirmacao.isPresent() && resultadoConfirmacao.get() == ButtonType.OK) {
			RepositorioAgenda<Contato> repositorioContato = new RepositorioContato();
			repositorioContato.excluir(this.contatoSelecionado);
			carregarTabelaContato();
			this.tabelaContatos.getSelectionModel().selectFirst();
		}

	}

	private void carregarTabelaContato() {
		try {
			RepositorioAgenda<Contato> repositorioContato = new RepositorioContatoJdbc();
			List<Contato> contatos = repositorioContato.selecionar();
			ObservableList<Contato> contatosObservableList = FXCollections.observableList(contatos);
			this.tabelaContatos.getItems().setAll(contatosObservableList);
		} catch (Exception e) {
			Alert mensagem = new Alert(AlertType.ERROR);
			mensagem.setTitle("ERRO");
			mensagem.setHeaderText("Erro no banco de dados");
			mensagem.setContentText("Não conectado: " + e.getMessage());
			mensagem.showAndWait();
		}
	}

	private void habilitarEditAgenda(Boolean isHabilitade) {
		this.txfNome.setDisable(!isHabilitade);
		this.txfIdade.setDisable(!isHabilitade);
		this.txfEmail.setDisable(!isHabilitade);
		this.txfTelefone.setDisable(!isHabilitade);
		this.btnSava.setDisable(!isHabilitade);
		this.btnCancel.setDisable(!isHabilitade);
		this.btnInsert.setDisable(isHabilitade);
		this.btnUpdate.setDisable(isHabilitade);
		this.btnDelete.setDisable(isHabilitade);
		this.tabelaContatos.setDisable(isHabilitade);
	}
}
