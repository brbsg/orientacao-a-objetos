package products;

import model.Produto;

public class Bolsa extends Produto{
	private String material;
	
	public Bolsa(int idProduto, String nome, String cor, String categoria, String marca, String tamanho, int preco,
			String material) {
		super(idProduto, nome, cor, categoria, marca, tamanho, preco);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	
	
	
	
}