package controller;

import model.*;

public class EmployeeController {
	private Employee[] p;
	private int qtdFuncionarios;

	public EmployeeController(DataController d) {
		this.p = d.getEmployees();
		this.qtdFuncionarios = d.getAmountOfEmployees();
	}

	public String[] getNomeProf() {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			s[i] = p[i].getName();
		}

		return s;
	}
	public int getQtd() {
		return qtdFuncionarios;
	}

	public void setQtd(int qtd) {
		this.qtdFuncionarios = qtd;
	}

	public String getNome(int i) {		
		return p[i].getName();
	}

	public String getCPF(int i) {
		String numCPF = String.valueOf(p[i].getCPF());
		return numCPF;
	}

	public String getID(int i) {
		String numID = String.valueOf(p[i].getNumID());
		return numID;
	}

	public Telefone getNumTel(int i) {
		return p[i].getNumTel();
	}

	
	public double getSalario (int i) {
		return p[i].getSalary();
	}
	
	public String getEndereco(int i) {		
		return p[i].getAddress();
	}	
	
}