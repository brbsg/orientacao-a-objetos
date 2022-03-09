package products;

import model.Produto;

public class Roupa extends Produto{
	private String tecido;
	private String medidas;
	public Roupa(int idProduto, String nome, String cor, String categoria, String marca, String tamanho, int preco,
			String tecido, String medidas) {
		super(idProduto, nome, cor, categoria, marca, tamanho, preco);
		this.tecido = tecido;
		this.medidas = medidas;
	}
	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public String getMedidas() {
		return medidas;
	}
	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}


	
	

}
