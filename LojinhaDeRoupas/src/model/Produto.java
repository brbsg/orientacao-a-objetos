package model;

public  class Produto {
	private int idProduto;
	private String nome;
	private String cor;
	private String categoria;
	private String marca;
	private int preco;
	
	public Produto(int idProduto,String nome, String cor, String categoria, String marca, int preco) {
		
		this.idProduto = idProduto;
		this.cor = cor;
		this.categoria = categoria;
		this.marca = marca;
		this.preco = preco;
	}

	public int getIdProduto() {
		return idProduto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	} 
	
	
	

}