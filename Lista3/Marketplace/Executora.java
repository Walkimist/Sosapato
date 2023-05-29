package Entrega3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Executora {
	static ArrayList<Produto> produtosLoja = new ArrayList<>();
	static ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	public static void main(String[] args) {
		Admin adm = new Admin("adm", "0", "0");
		adicionarAdmin(adm);
		valoresIniciais();
		marketplace();
	}
	
	public static void marketplace() {
		System.out.println("===========================================");
		System.out.println("             SOSAPATO - HOME");
		System.out.println("===========================================");
		System.out.println("     LOGIN[1] - REGISTRO[2] - BUSCAR[3]");
		System.out.println("       POPULARES[4] - VENDEDORES[5]");
		System.out.println("===========================================");
		System.out.print("Opcao: ");
		switch(getOption()) {
			case 1: 
				login();
			break;
			case 2:
				registroCliente();
			break;
			case 3:
				buscarProduto();
			break;
			case 4:
				produtosMaisVendidos();
			break;
			case 5:
				topVendedores();
			break;
			default:
				return;
		}
	}
	
	public static void login() {
		System.out.println("===========================================");
		System.out.println("              SOSAPATO - LOGIN");
		System.out.println("===========================================");
		System.out.println("CONTINUAR COMO VISITANTE[1] - ANUNCIANTE[2]");
		System.out.println("         COMPRADOR[3] - ADMIN[4]");
		System.out.println("===========================================");
		System.out.println("Perfil: ");
		switch(getOption()) {
			case 1:
				marketplace();
			break;
			case 2:
				loginAnunciante();
			break;
			case 3:
				loginComprador();
			break;
			case 4:
				loginAdmin();
			break;
			default:
				marketplace();
			break;
		}
	}
		
	public static void loginAnunciante() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("        SOSAPATO - LOGIN ANUNCIANTE");
		System.out.println("===========================================");
		System.out.println("Usuario: ");
		String usuario = sc.next();
		System.out.println("Senha: ");
		String senha = sc.next();
		for(Pessoa p : pessoas) {
			if (p instanceof Anunciante && checarCredenciais(usuario, senha, p)) {
				areaAnunciante(p);
			}
		}
	}
		
	public static void areaAnunciante(Pessoa p) {
		System.out.println("===========================================");
		System.out.println("        SOSAPATO - AREA ANUNCIANTE");
		System.out.println("===========================================");
		System.out.println("Nome: " + p.getNome());
		System.out.println("===========================================");
		System.out.println("    ADICIONAR PRODUTO[1] - RETORNAR[2]");
		System.out.println("===========================================");
		System.out.println("Opcao: ");
		switch(getOption()) {
			case 1:
				Scanner sc = new Scanner(System.in);
				System.out.println("Nome: ");
				String nome = sc.next();
				String marca = p.getNome();
				System.out.println("ID: ");
				Long id = sc.nextLong();
				System.out.println("Quantidade: ");
				int quantidade = sc.nextInt();
				System.out.println("Categoria: ");
				String categ = sc.next();
				Categoria categoria = Categoria.valueOf(categ.toUpperCase());
				System.out.println("Preco: ");
				double preco = sc.nextDouble();
				System.out.println("Tamanho: ");
				double tamanho = sc.nextDouble();
				Produto produto = new Produto(nome, marca, id, quantidade, categoria, preco, tamanho, 0);
				adicionarProduto(produto);
				System.out.println("===========================================");
				System.out.println("            PRODUTO ADICIONADO!");
				System.out.println("===========================================");
			break;
			default:
				marketplace();
			break;
		}
	}
	
	public static void loginComprador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("        SOSAPATO - LOGIN CLIENTE");
		System.out.println("===========================================");
		System.out.println("Usuario: ");
		String usuario = sc.next();
		System.out.println("Senha: ");
		String senha = sc.next();
		for(Pessoa p : pessoas) {
			if (p instanceof Cliente && checarCredenciais(usuario, senha, p)) {
				areaComprador(p);
			}
		}
	}
	
	public static void areaComprador(Pessoa p) {
		System.out.println("===========================================");
		System.out.println("        SOSAPATO - AREA COMPRADOR");
		System.out.println("===========================================");
		System.out.println("Nome: " + p.getNome());
		System.out.println("===========================================");
		System.out.println("              RETORNAR[2]");
		System.out.println("===========================================");
		System.out.println("Opcao: ");
		marketplace();
	}
	
	public static void loginAdmin() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("        SOSAPATO - LOGIN ADMIN");
		System.out.println("===========================================");
		System.out.println("Usuario: ");
		String usuario = sc.next();
		System.out.println("Senha: ");
		String senha = sc.next();
		for(Pessoa p : pessoas) {
			if (p instanceof Admin && checarCredenciais(usuario, senha, p)) {
				areaAdmin(p);
			}
		}
	}
	
	public static void areaAdmin(Pessoa p) {
		System.out.println("===========================================");
		System.out.println("          SOSAPATO - AREA ADMIN");
		System.out.println("===========================================");
		System.out.println("Nome: " + p.getNome());
		System.out.println("===========================================");
		System.out.println("               RETORNAR[2]");
		System.out.println("===========================================");
		System.out.println("Opcao: ");
		getOption();
		marketplace();
		
	}
	
	public static void registroCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("           SOSAPATO - REGISTRO");
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
		Cliente cliente = new Cliente(nome, cpf, usuario, senha);
		adicionarCliente(cliente);
		System.out.println("===========================================");
		System.out.println("          CLIENTE REGISTRADO!");
		System.out.println("===========================================");
		getOption();
		marketplace();
	}
	
	public static void produtosMaisVendidos() {
		System.out.println("===========================================");
		System.out.println("     SOSAPATO - PRODUTOS MAIS VENDIDOS");
		System.out.println("===========================================");
		listarProdutosMaisVendidos(3);
		System.out.println("      LISTAR TOP 10[1] - RETORNAR[2]");
		System.out.println("===========================================");
		System.out.println("Opcao: ");
		switch(getOption()) {
			case 1:
				System.out.println("===========================================");
				System.out.println("     SOSAPATO - PRODUTOS MAIS VENDIDOS");
				System.out.println("===========================================");
				listarProdutosMaisVendidos(10);
				System.out.println("===========================================");
				getOption();
				System.out.println("> ");
				marketplace();
			break;
			default:
				marketplace();
			break;
		}
	}
	
	public static void topVendedores() {
		System.out.println("===========================================");
		System.out.println("      SOSAPATO - MAIORES VENDEDORES");
		System.out.println("===========================================");
		listarMaioresVendedores(3);
		System.out.println("      LISTAR TOP 10[1] - RETORNAR[2]");
		System.out.println("===========================================");
		System.out.println("Opcao: ");
		switch(getOption()) {
			case 1:
				System.out.println("===========================================");
				System.out.println("     SOSAPATO - PRODUTOS MAIS VENDIDOS");
				System.out.println("===========================================");
				listarMaioresVendedores(10);
				System.out.println("===========================================");
				getOption();
				System.out.println("> ");
				marketplace();
			break;
			default:
				marketplace();
			break;
		}
	}
	
	public static void buscarProduto() {
		System.out.println("===========================================");
		System.out.println("       SOSAPATO - BUSCA POR CATEGORIA");
		System.out.println("===========================================");
		System.out.println("        MASCULINO[1] - FEMININO[2]");
		System.out.println("         INFANTIL[3] - ESPORTE[4]");
		System.out.println("===========================================");
		System.out.println("Categoria: ");
		switch(getOption()) {
			case 1:
				System.out.println("===========================================");
				System.out.println("            SOSAPATO - MASCULINO");
				System.out.println("===========================================");
				imprimirProdutos("MASCULINO");
			break;
			case 2:
				System.out.println("===========================================");
				System.out.println("            SOSAPATO - FEMININO");
				System.out.println("===========================================");
				imprimirProdutos("FEMININO");
			break;
			case 3:
				System.out.println("===========================================");
				System.out.println("            SOSAPATO - INFANTIL");
				System.out.println("===========================================");
				imprimirProdutos("INFANTIL_MASCULINO");
				imprimirProdutos("INFANTIL_FEMININO");
			break;
			case 4:
				System.out.println("===========================================");
				System.out.println("            SOSAPATO - ESPORTE");
				System.out.println("===========================================");
				imprimirProdutos("ESPORTE");
			break;
			default:
				marketplace();
			break;
		}
		getOption();
		marketplace();
	}
	
	public static void imprimirProdutos(String categ) {
		Categoria categoria = Categoria.valueOf(categ.toUpperCase());
		for (Produto p : produtosLoja) {
			if (p.getCategoria().equals(categoria)) {
				System.out.println(p.getNome() + "[" + p.getId() + "] ");
			}
		}
	}
	
	public static void listarMaioresVendedores (int quantidade) {
		List<Produto> produtosOrdenados = new ArrayList<Produto>();
		
		for(int i = 0; i < produtosLoja.size(); i++) {
			for(int j = 0; j < produtosLoja.size(); j++){
				if(produtosLoja.get(i).getQuantidadeVendas() > produtosLoja.get(j).getQuantidadeVendas()) {
					Produto troca = produtosLoja.get(i);
					produtosLoja.set(i, produtosLoja.get(j));
					produtosLoja.set(j, troca);
				}
			}
		}
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println(produtosOrdenados.get(i).getMarca() + "[" + produtosOrdenados.get(i).getId()+ "] ");
		}
	}
	
	public static void listarProdutosMaisVendidos (int quantidade) {
		List<Produto> produtosOrdenados = new ArrayList<Produto>();
		
		for(int i = 0; i < produtosLoja.size(); i++) {
			for(int j = 0; j < produtosLoja.size(); j++){
				if(produtosLoja.get(i).getQuantidadeVendas() > produtosLoja.get(j).getQuantidadeVendas()) {
					Produto troca = produtosLoja.get(i);
					produtosLoja.set(i, produtosLoja.get(j));
					produtosLoja.set(j, troca);
				}
			}
		}
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println(produtosOrdenados.get(i).getNome() + "[" + produtosOrdenados.get(i).getId()+ "] ");
		}
	}

	public static boolean checarCredenciais(String usuario, String senha, Pessoa p) {
		if(p.getUsuario().equals(usuario) && p.getSenha().equals(senha)) {
			return true;
		}
		return false;
	}
	
	public static int getOption() {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}
	
	public static void adicionarCliente (Cliente cliente) {
		pessoas.add(cliente);
	}
	
	public static void adicionarAdmin (Admin admin) {
		pessoas.add(admin);
	}
	
	public static void adicionarProduto (Produto produto) {
		produtosLoja.add(produto);
	}

	public static void valoresIniciais() {
		Categoria categoria = Categoria.valueOf("feminino".toUpperCase());
		Produto produto = new Produto("Chinelo", "Havaianas", (long) 1, 24, categoria, 15, 33, 83);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("infantil_masculino".toUpperCase());
		produto = new Produto("Crocs", "Crocs", (long) 2, 44, categoria, 15, 22, 26);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("esporte".toUpperCase());
		produto = new Produto("Tênis Corrida", "Nike", (long) 3, 14, categoria, 15, 35, 134);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("esporte".toUpperCase());
		produto = new Produto("Tênis", "Adidas", (long) 4, 214, categoria, 15, 32, 29);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("feminino".toUpperCase());
		produto = new Produto("Salto", "Zattini", (long) 5, 54, categoria, 15, 34, 13);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("masculino".toUpperCase());
		produto = new Produto("Sandalia", "Havaianas", (long) 6, 25, categoria, 15, 32, 13);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("masculino".toUpperCase());
		produto = new Produto("Sapatilha", "Havaianas", (long) 7, 76, categoria, 15, 33, 13);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("infantil_masculino".toUpperCase());
		produto = new Produto("Allstar", "Havaianas", (long) 8, 44, categoria, 15, 25, 13);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("infantil_feminino".toUpperCase());
		produto = new Produto("Pantufa", "Havaianas", (long) 9, 23, categoria, 15, 27, 13);
		adicionarProduto(produto);
		categoria = Categoria.valueOf("feminino".toUpperCase());
		produto = new Produto("Coturno", "Havaianas", (long) 10, 24, categoria, 15, 33, 13);
		adicionarProduto(produto);
		
	}
}
