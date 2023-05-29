package Entrega3;

public class Produto {
	private String nome; 
	private String marca; 
	private Long id; 
	private int quantidade; 
	private Categoria categoria; 
	private double preco; 
	private double tamanho;
	private int quantidadeVendas;
	
	public Produto(String nome, String marca, Long id, int quantidade, Categoria categoria, double preco,
			double tamanho, int quantidadeVendas) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.id = id;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.preco = preco;
		this.tamanho = tamanho;
		this.setQuantidadeVendas(quantidadeVendas);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}
}
