package model;

import java.util.ArrayList;

public class Venda  {
	private int idCliente;
	private int idFuncionario;
	private int valorTotal;
	private ArrayList<Produto> listaProdutos= new ArrayList<Produto>();
	

	
	public Venda(int idCliente, int idFuncionario) {

		this.idCliente = idCliente;
		this.idFuncionario = idFuncionario;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void adicionaProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		listaProdutos.remove(produto);
		
	}

	
}
