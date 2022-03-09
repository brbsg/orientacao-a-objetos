package products;

import model.Produto;

public class Oculos extends Produto{

	private String textura;
	private String formato;
	private String estilo;
	private String tipo;
	
	public Oculos(int idProduto, String nome, String cor, String categoria, String marca, String tamanho, int preco,
			String textura, String formato, String estilo, String tipo) {
		super(idProduto, nome, cor, categoria, marca, tamanho, preco);
		this.textura = textura;
		this.formato = formato;
		this.estilo = estilo;
		this.tipo = tipo;
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

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

		
	
}
