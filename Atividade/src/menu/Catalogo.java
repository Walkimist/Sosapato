package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import metodos.getoption;
import metodos.infoConexao;

public class Catalogo {
	public static void listarCatalogo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("            SOSAPATO - CATALOGO");
		System.out.println("===========================================");
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(infoConexao.url, infoConexao.user, infoConexao.pass);
			
			String select = "SELECT * FROM produtos";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			
			int i = 1;
			while (rs.next()) {
				System.out.print("    "+rs.getInt(1)+". "+rs.getString(3) + "    ");
				if (i%2 == 0) {
					System.out.println("");
				}
				i++;
			}
			System.out.println("");
			System.out.println("===========================================");
			System.out.println("       INSIRA O ID DO PRODUTO DESEJADO");
			System.out.println("===========================================");
			String id = sc.next();
			select = "SELECT * FROM produtos WHERE id="+id;
			rs = stmt.executeQuery(select);
			while (rs.next()) {
				PaginaEntidade.paginaProduto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
			}
			System.out.println("Produto inválido...");
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
