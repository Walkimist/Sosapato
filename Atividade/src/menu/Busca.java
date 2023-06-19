package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import metodos.getoption;
import metodos.infoConexao;

public class Busca {
	public static void escolhaBusca() {
		System.out.println("===========================================");
		System.out.println("           SOSAPATO - BUSCAR");
		System.out.println("===========================================");
		System.out.println("          CLIENTE[1] - PRODUTO[2]");
		System.out.println("         ANUNCIANTE[3] - ADMIN[4]");
		System.out.println("===========================================");
		System.out.print("Opção: ");
		switch(getoption.getOption()) {
			case 1: 
				buscarCliente();
			break;
			case 2:
				buscarProduto();
			break;
			case 3:
				buscarAnunciante();
			break;
			case 4:
				buscarAdmin();
			break;
			default:
			return;
		}
	}
	
	public static void buscarCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("              CLIENTE - BUSCA");
		System.out.println("===========================================");
		System.out.println("      INSIRA O CPF DO CLIENTE DESEJADO");
		System.out.println("===========================================");
		String busca = sc.next();
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String select = "SELECT * FROM clientes WHERE cpf="+busca;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			
			while (rs.next()) {
				PaginaEntidade.paginaCliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
			System.out.println("Cliente não encontrado...");
			System.out.println("Pressione enter para continuar");
			getoption.getInput();
			Inicio.inicio();
			
		} catch(SQLException e) {
			System.out.println("Erro SQL...");
			System.out.println(e);
		} catch(Exception ex) {
			System.out.println("Erro geral...");
			System.out.println(ex);
		}
	}

	public static void buscarProduto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("              PRODUTO - BUSCA");
		System.out.println("===========================================");
		System.out.println("       INSIRA O ID DO PRODUTO DESEJADO");
		System.out.println("===========================================");
		String busca = sc.next();
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String select = "SELECT * FROM produtos WHERE id="+busca;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			
			while (rs.next()) {
				PaginaEntidade.paginaProduto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
			}
			System.out.println("Produto não encontrado...");
			System.out.println("Pressione enter para continuar");
			getoption.getInput();
			Inicio.inicio();
			
		} catch(SQLException e) {
			System.out.println("Erro SQL...");
			System.out.println(e);
		} catch(Exception ex) {
			System.out.println("Erro geral...");
			System.out.println(ex);
		}
	}
	
	public static void buscarAnunciante() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("            ANUNCIANTE - BUSCA");
		System.out.println("===========================================");
		System.out.println("    INSIRA O CNPJ DO ANUNCIANTE DESEJADO");
		System.out.println("===========================================");
		String busca = sc.next();
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String select = "SELECT * FROM anunciantes WHERE cnpj="+busca;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			
			while (rs.next()) {
				PaginaEntidade.paginaAnunciante(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			System.out.println("Anunciante não encontrado...");
			System.out.println("Pressione enter para continuar");
			getoption.getInput();
			Inicio.inicio();
			
		} catch(SQLException e) {
			System.out.println("Erro SQL...");
			System.out.println(e);
		} catch(Exception ex) {
			System.out.println("Erro geral...");
			System.out.println(ex);
		}
	}
	
	public static void buscarAdmin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("               ADMIN - BUSCA");
		System.out.println("===========================================");
		System.out.println("       INSIRA O CPF DO ADMIN DESEJADO");
		System.out.println("===========================================");
		String busca = sc.next();
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String select = "SELECT * FROM admin WHERE cpf="+busca;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			
			while (rs.next()) {
				PaginaEntidade.paginaAdmin(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
			System.out.println("Admin não encontrado...");
			System.out.println("Pressione enter para continuar");
			getoption.getInput();
			Inicio.inicio();
			
		} catch(SQLException e) {
			System.out.println("Erro SQL...");
			System.out.println(e);
		} catch(Exception ex) {
			System.out.println("Erro geral...");
			System.out.println(ex);
		}
	}
}
