package Entrega3;

public class Cliente extends Pessoa{
	private String CPF;
	
	public Cliente(String nome, String CPF, String nomeUsuario, String senha) {
		this.CPF = CPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
}

