package model;

/**
 * Cadastrador de Telefone
 * @author Lucas & Gustavo
 * @version 1.0 (Abril 2022)
 */
public class Telefone {
	
	private int DDD;
	private int numero;
	

	/**
	 * Controlador de telefone
	 * @param cod
	 * @param num
	 */
	public Telefone(int cod, int num) {
		DDD = cod;
		numero = num;
	}
	
	public Telefone() {
		
	}
	/**
	 * Transformador
	 * @return Telefone
	 */
	public String toString() {
		return "Telefone: (" + DDD + ") " + numero;
	}

	public int getDDD() {
		return DDD;
	}


	public void setDDD(int dDD) {
		DDD = dDD;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}