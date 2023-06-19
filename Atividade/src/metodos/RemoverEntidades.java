package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import menu.Inicio;

public class RemoverEntidades {
	public static void removerCliente(String cpf) {
		System.out.println("Conectando..");
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String remove = "DELETE FROM clientes WHERE cpf="+cpf; 
			Statement stmt = conn.createStatement();
			stmt.execute(remove);
			System.out.println("===========================================");
			System.out.println("            CLIENTE REMOVIDO!");
			System.out.println("===========================================");
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
	
	public static void removerAnunciante(String cnpj) {
		System.out.println("Conectando..");
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String remove = "DELETE FROM anunciantes WHERE cnpj="+cnpj; 
			Statement stmt = conn.createStatement();
			stmt.execute(remove);
			System.out.println("===========================================");
			System.out.println("           ANUNCIANTE REMOVIDO!");
			System.out.println("===========================================");
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
	
	public static void removerAdmin(String cpf) {
		System.out.println("Conectando..");
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String remove = "DELETE FROM admin WHERE cpf="+cpf; 
			Statement stmt = conn.createStatement();
			stmt.execute(remove);
			System.out.println("===========================================");
			System.out.println("             ADMIN REMOVIDO!");
			System.out.println("===========================================");
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
	
	public static void removerProduto(int id) {
		System.out.println("Conectando..");
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String remove = "DELETE FROM produtos WHERE id="+id; 
			Statement stmt = conn.createStatement();
			stmt.execute(remove);
			System.out.println("===========================================");
			System.out.println("             PRODUTO REMOVIDO!");
			System.out.println("===========================================");
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
