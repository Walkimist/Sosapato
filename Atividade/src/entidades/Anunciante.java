package entidades;

public class Anunciante extends Pessoa {
	private String cnpj;
	private String cep;
	
	public Anunciante(String nome, String usuario, String senha, String cnpj, String cep) {
		super.setNome(nome);
		super.setUsuario(usuario);
		super.setSenha(senha);
		this.cnpj = cnpj;
		this.cep = cep;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
