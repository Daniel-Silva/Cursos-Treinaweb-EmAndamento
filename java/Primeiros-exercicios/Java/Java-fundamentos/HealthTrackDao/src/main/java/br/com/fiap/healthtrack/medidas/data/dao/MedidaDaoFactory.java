package br.com.fiap.healthtrack.medidas.data.dao;

import br.com.fiap.healthtrack.medidas.alimentacao.Alimentacao;
import br.com.fiap.healthtrack.medidas.atividadefisica.AtividadeFisica;
import br.com.fiap.healthtrack.medidas.data.MedidaDBDomain;
import br.com.fiap.healthtrack.medidas.data.MedidaDaoType;
import br.com.fiap.healthtrack.medidas.data.MedidaType;
import br.com.fiap.healthtrack.medidas.peso.Peso;
import br.com.fiap.healthtrack.medidas.pressao.Pressao;

public class MedidaDaoFactory {

	private static MedidaDaoFactory instance;


	public static MedidaDaoFactory getInstance() {
		if (instance == null) {
			instance = new MedidaDaoFactory();
		}
		return instance;
	}

	public MedidaDao<?> getMedidaDao(MedidaDaoType type){
		if(type.getMedidaType().equals(MedidaType.PESO) && type.getDBDomain().equals(MedidaDBDomain.TESTE)) {
			return new MedidaTestDaoImpl<Peso>();	
		}
		else if(type.getMedidaType().equals(MedidaType.PRESSAO) && type.getDBDomain().equals(MedidaDBDomain.TESTE)) {
			return new MedidaTestDaoImpl<Pressao>();	
		}
		else if(type.getMedidaType().equals(MedidaType.ALIMENTACAO) && type.getDBDomain().equals(MedidaDBDomain.TESTE)) {
			return new MedidaTestDaoImpl<Alimentacao>();	
		}
		else if(type.getMedidaType().equals(MedidaType.ATIVIDADE_FISICA) && type.getDBDomain().equals(MedidaDBDomain.TESTE)) {
			return new MedidaTestDaoImpl<AtividadeFisica>();	
		}
		MedidaDao<Peso> dao = new MedidaTestDaoImpl<Peso>();
	
		return dao;
	}
}


