package menu;

import java.util.Scanner;

import entidades.*;
import metodos.adicionarEntidades;
import metodos.getoption;

public class Registrar {
	public static void registrar() {
		System.out.println("===========================================");
		System.out.println("           SOSAPATO - REGISTRAR");
		System.out.println("===========================================");
		System.out.println("          CLIENTE[1] - PRODUTO[2]");
		System.out.println("         ANUNCIANTE[3] - ADMIN[4]");
		System.out.println("===========================================");
		System.out.print("Opção: ");
		switch(getoption.getOption()) {
			case 1: 
				registroCliente();
			break;
			case 2:
				registroProduto();
			break;
			case 3:
				registroAnunciante();
			break;
			case 4:
				registroAdmin();
			break;
			default:
			return;
		}
	}
	
	public static void registroCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("            CLIENTE - REGISTRO");
		System.out.println("===========================================");
		System.out.println("     PREENCHA AS SEGUINTES INFORMACOES");
		System.out.println("===========================================");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Usuario: ");
		String usuario = sc.next();
		System.out.print("Senha: ");
		String senha = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		Cliente cliente = new Cliente(nome, usuario, senha, cpf);
		adicionarEntidades.adicionarCliente(cliente);
		System.out.println("===========================================");
		System.out.println("           CLIENTE REGISTRADO!");
		System.out.println("===========================================");
		System.out.println("Pressione enter para continuar");
		getoption.getInput();
		Inicio.inicio();
	}
	
	public static void registroProduto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("           PRODUTO - REGISTRO");
		System.out.println("===========================================");
		System.out.println("     PREENCHA AS SEGUINTES INFORMACOES");
		System.out.println("===========================================");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Marca: ");
		String marca = sc.next();
		System.out.print("Categoria: ");
		String categoria = sc.next();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Tamanho: ");
		double tamanho = sc.nextDouble();
		Produto produto = new Produto(nome, marca, categoria, quantidade, preco, tamanho);
		adicionarEntidades.adicionarProduto(produto);
		System.out.println("===========================================");
		System.out.println("            PRODUTO REGISTRADO!");
		System.out.println("===========================================");
		System.out.println("Pressione enter para continuar");
		getoption.getInput();
		Inicio.inicio();
	}
	
	public static void registroAnunciante() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("           ANUNCIANTE - REGISTRO");
		System.out.println("===========================================");
		System.out.println("     PREENCHA AS SEGUINTES INFORMACOES");
		System.out.println("===========================================");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Usuario: ");
		String usuario = sc.next();
		System.out.print("Senha: ");
		String senha = sc.next();
		System.out.print("CEP: ");
		String cep = sc.next();
		System.out.print("CNPJ: ");
		String cnpj = sc.next();
		Anunciante anunciante = new Anunciante(nome, usuario, senha, cnpj, cep);
		adicionarEntidades.adicionarAnunciante(anunciante);
		System.out.println("===========================================");
		System.out.println("          ANUNCIANTE REGISTRADO!");
		System.out.println("===========================================");
		System.out.println("Pressione enter para continuar");
		getoption.getInput();
		Inicio.inicio();
	}
	
	public static void registroAdmin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("            ADMIN - REGISTRO");
		System.out.println("===========================================");
		System.out.println("     PREENCHA AS SEGUINTES INFORMACOES");
		System.out.println("===========================================");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Usuario: ");
		String usuario = sc.next();
		System.out.print("Senha: ");
		String senha = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		Admin admin = new Admin(nome, usuario, senha, cpf);
		adicionarEntidades.adicionarAdmin(admin);
		System.out.println("===========================================");
		System.out.println("             ADMIN REGISTRADO!");
		System.out.println("===========================================");
		System.out.println("Pressione enter para continuar");
		getoption.getInput();
		Inicio.inicio();
	}
}
