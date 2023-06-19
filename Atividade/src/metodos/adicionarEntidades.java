package metodos;

import entidades.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class adicionarEntidades {
	public static void adicionarCliente(Cliente c) {
		System.out.println("Conectando..");
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String insert = "INSERT INTO clientes (`cpf`, `nome`, `usuario`, `senha`) " 
							+ "VALUES ('"+ c.getCpf() +"', '"+ c.getNome() +"', '"+ c.getUsuario() +"', '"+ c.getSenha() +"')";
			Statement stmt = conn.createStatement();
			stmt.execute(insert);
		} catch(SQLException e) {
			System.out.println("Erro SQL...");
			System.out.println(e);
		} catch(Exception ex) {
			System.out.println("Erro geral...");
			System.out.println(ex);
		}
	}
	
	public static void adicionarAdmin(Admin a) {
		System.out.println("Conectando..");
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String insert = "INSERT INTO admin (`cpf`, `nome`, `usuario`, `senha`) " 
							+ "VALUES ('"+ a.getCpf() +"', '"+ a.getNome() +"', '"+ a.getUsuario() +"', '"+ a.getSenha() +"')";
			Statement stmt = conn.createStatement();
			stmt.execute(insert);
		} catch(SQLException e) {
			System.out.println("Erro SQL...");
			System.out.println(e);
		} catch(Exception ex) {
			System.out.println("Erro geral...");
			System.out.println(ex);
		}
	}
	
	public static void adicionarAnunciante(Anunciante a) {
		System.out.println("Conectando..");
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String insert = "INSERT INTO anunciantes (`cnpj`, `nome`, `usuario`, `senha`, `cep`) " 
							+ "VALUES ('"+ a.getCnpj() +"', '"+ a.getNome() +"', '"+ a.getUsuario() +"', '"+ a.getSenha() +"', '"+ a.getCep() +"')";
			Statement stmt = conn.createStatement();
			stmt.execute(insert);
		} catch(SQLException e) {
			System.out.println("Erro SQL...");
			System.out.println(e);
		} catch(Exception ex) {
			System.out.println("Erro geral...");
			System.out.println(ex);
		}
	}
	
	public static void adicionarProduto(Produto p) {
		System.out.println("Conectando..");
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String insert = "INSERT INTO produtos (`nome`, `preco`, `tamanho`, `categoria`, `marca`, `quantidade`) " 
							+ "VALUES ('"+ p.getNome() +"', '"+ p.getPreco() +"', '"+ p.getTamanho() +"', '"+ p.getCategoria() +"', '"+ p.getMarca() +"', '"+ p.getQuantidade() +"')";
			Statement stmt = conn.createStatement();
			stmt.execute(insert);
		} catch(SQLException e) {
			System.out.println("Erro SQL...");
			System.out.println(e);
		} catch(Exception ex) {
			System.out.println("Erro geral...");
			System.out.println(ex);
		}
	}
}
