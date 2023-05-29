package Entrega3;

import java.util.ArrayList;
import java.util.List;

public class Anunciante extends Pessoa{
	private String cnpj;
	private List<Produto> produtosVendidos;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void vender(Produto p) {
		produtosVendidos.add(p);
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Anunciante(String cnpj) {
		super();
		this.cnpj = cnpj;
		this.produtosVendidos = new ArrayList<>();
	}
	
	public int quantidadeProdutosVendidos() {
		return produtosVendidos.size();
	}
}
