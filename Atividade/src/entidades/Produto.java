package entidades;

public class Produto {
	private String nome;
	private String marca;
	private String categoria;
	private int quantidade;
	private double preco;
	private double tamanho;
	
	public Produto(String nome, String marca, String categoria, int quantidade, double preco, double tamanho) {
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.preco = preco;
		this.tamanho = tamanho;
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
}
