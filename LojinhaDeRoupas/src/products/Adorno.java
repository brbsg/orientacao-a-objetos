package products;

import model.Produto;

public class Adorno extends Produto{

	private String material;
	private String joia;
	
	
	
	
	public Adorno(int idProduto, String nome, String cor, String categoria, String marca, String tamanho, int preco,
			String material, String joia) {
		super(idProduto, nome, cor, categoria, marca, tamanho, preco);
		this.material = material;
		this.joia = joia;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getJoia() {
		return joia;
	}
	public void setJoia(String joia) {
		this.joia = joia;
	}
	
	
}