package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.repositorios.impl.RepositorioContatoJdbc;
import br.com.treinaweb.agenda.repositorios.interfaces.RepositorioAgenda;

@WebServlet(urlPatterns = {"/listar"})
public class ListarContatosServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RepositorioAgenda<Contato> agendaRepositorio = new RepositorioContatoJdbc();
		try {
			List<Contato> contatos = agendaRepositorio.selecionar();
			req.setAttribute("listaContatos", contatos);
		} catch (SQLException e) {
			req.setAttribute("mensagemErro", e.getMessage());
		}
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/paginas/agenda/listaContatos.jsp");
		dispatcher.forward(req, resp);
	}
	
	

}
