package menu;

import metodos.*;

public class PaginaEntidade {
	public static void paginaCliente(String cpf, String usuario, String senha, String nome) {
		System.out.println("===========================================");
		System.out.println("              CLIENTE - BUSCA");
		System.out.println("===========================================");
		System.out.println("CPF: "+ cpf);
		System.out.println("Nome: "+ nome);
		System.out.println("Usuario: "+ usuario);
		System.out.println("Senha: "+ senha);
		System.out.println("===========================================");
		System.out.println("          REMOVER[1] - VOLTAR[2]");
		System.out.println("===========================================");
		System.out.print("Opção: ");
		switch(getoption.getOption()) {
			case 1: 
				RemoverEntidades.removerCliente(cpf);
			break;
			case 2:
				Inicio.inicio();
			break;
			default:
			return;
		}
	}
	public static void paginaAnunciante(String cnpj, String cep, String nome, String usuario, String senha) {
		System.out.println("===========================================");
		System.out.println("              CLIENTE - BUSCA");
		System.out.println("===========================================");
		System.out.println("CNPJ: "+ cnpj);
		System.out.println("CEP: "+ cep);
		System.out.println("Nome: "+ nome);
		System.out.println("Usuario: "+ usuario);
		System.out.println("Senha: "+ senha);
		System.out.println("===========================================");
		System.out.println("          REMOVER[1] - VOLTAR[2]");
		System.out.println("===========================================");
		System.out.print("Opção: ");
		switch(getoption.getOption()) {
			case 1: 
				RemoverEntidades.removerAnunciante(cnpj);
			break;
			case 2:
				Inicio.inicio();
			break;
			default:
			return;
		}
	}
	public static void paginaAdmin(String cpf, String nome, String usuario, String senha) {
		System.out.println("===========================================");
		System.out.println("               ADMIN - BUSCA");
		System.out.println("===========================================");
		System.out.println("CPF: "+ cpf);
		System.out.println("Nome: "+ nome);
		System.out.println("Usuario: "+ usuario);
		System.out.println("Senha: "+ senha);
		System.out.println("===========================================");
		System.out.println("          REMOVER[1] - VOLTAR[2]");
		System.out.println("===========================================");
		System.out.print("Opção: ");
		switch(getoption.getOption()) {
			case 1: 
				RemoverEntidades.removerAdmin(cpf);
			break;
			case 2:
				Inicio.inicio();
			break;
			default:
			return;
		}
	}
	public static void paginaProduto(int id, String categoria, String nome, Double preco, int quantidade, int tamanho, String marca) {
		System.out.println("===========================================");
		System.out.println("             PRODUTO - BUSCA");
		System.out.println("===========================================");
		System.out.println("ID: "+ id);
		System.out.println("Nome: "+ nome);
		System.out.println("Categoria: "+ categoria);
		System.out.println("Tamanho: "+ tamanho);
		System.out.println("Marca: "+ marca);
		System.out.println("Quantidade: "+ quantidade);
		System.out.println("Preço: R$"+ preco);
		System.out.println("===========================================");
		System.out.println("          REMOVER[1] - VOLTAR[2]");
		System.out.println("===========================================");
		System.out.print("Opção: ");
		switch(getoption.getOption()) {
			case 1: 
				RemoverEntidades.removerProduto(id);
			break;
			case 2:
				Inicio.inicio();
			break;
			default:
			return;
		}
	}
}
