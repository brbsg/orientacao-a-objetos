package products;

import model.Produto;

public class Carteira extends Produto{
	private String textura;
	private String formato;
	private String fecho;
	private String medidas;
	public Carteira(int idProduto, String nome, String cor, String categoria, String marca, String tamanho, int preco,
			String textura, String formato, String fecho, String medidas) {
		super(idProduto, nome, cor, categoria, marca, tamanho, preco);
		this.textura = textura;
		this.formato = formato;
		this.fecho = fecho;
		this.medidas = medidas;
	}
	public String getTextura() {
		return textura;
	}
	public void setTextura(String textura) {
		this.textura = textura;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getFecho() {
		return fecho;
	}
	public void setFecho(String fecho) {
		this.fecho = fecho;
	}
	public String getMedidas() {
		return medidas;
	}
	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	
	

}
