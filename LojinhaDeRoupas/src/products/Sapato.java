package products;

import model.Produto;

public class Sapato extends Produto {

	public String formato;

	public Sapato(int idProduto, String nome, String cor, String categoria, String marca, String tamanho, int preco,
			String formato) {
		super(idProduto, nome, cor, categoria, marca, tamanho, preco);
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	
	
	
	
}
