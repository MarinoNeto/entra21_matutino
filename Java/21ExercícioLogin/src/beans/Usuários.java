package beans;

public class Usuários {

	//Atributos Cadastro
	
	private String NomeAdm;
	private String SenhaAdm;
	private String tipo;
	private String email;
	
	
	//Set and Get
	public String getNomeAdm() {
		return NomeAdm;
	}
	public void setNomeAdm(String nomeAdm) {
		NomeAdm = nomeAdm;
	}
	public String getSenhaAdm() {
		return SenhaAdm;
	}
	public void setSenhaAdm(String senhaAdm) {
		SenhaAdm = senhaAdm;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
