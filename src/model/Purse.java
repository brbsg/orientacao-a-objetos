package model;

public class Purse extends Product{
	private String material;


	public Purse(int idProduto, String nome, String cor, String categoria, String marca, String tamanho, int preco,
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