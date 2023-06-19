package entidades;

public class Admin extends Pessoa{
	private String cpf;
	
	public Admin(String nome, String usuario, String senha, String cpf) {
		super.setNome(nome);
		super.setUsuario(usuario);
		super.setSenha(senha);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
