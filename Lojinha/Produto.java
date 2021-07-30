package Lojinha;

public class Produto {
	String nome;
	String descricao;
	double valorCompra;
	double porcentLucro;
	int qntEstoque;
	
	public Produto(String nome, String descricao, double valorCompra, double porcentLucro, int qntEstoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.porcentLucro = porcentLucro;
		this.qntEstoque = qntEstoque;
	}

}
