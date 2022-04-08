package model;

/**
 * Estender(Heran�a) a Purse da classe pai(Product)
 * @author Lucas & Gustavo
 * @version 1.0 (Abril 2022)
 */
public class Purse extends Product{
	private String material;

	/**
	 * Constructor de Purse
	 * @param idProduto
	 * @param nome
	 * @param cor
	 * @param categoria
	 * @param marca
	 * @param tamanho
	 * @param preco
	 * @param material
	 */
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