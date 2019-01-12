package br.com.fiap.healthtrack.medidas.data;

public class MedidaDaoType {

	private MedidaType type;
	private MedidaDBDomain domais;
	
	
	public MedidaDaoType(MedidaType type, MedidaDBDomain domais) {
		super();
		this.type = type;
		this.domais = domais;
	}
	
	public MedidaType getMedidaType() {
		return type;
	}
	
	public MedidaDBDomain getDBDomain() {
		return domais;
	}
	
	
}


