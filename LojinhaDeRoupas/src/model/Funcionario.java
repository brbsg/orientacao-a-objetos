package model;

public class Funcionario extends Pessoa{
	private int idFuncionario;
	private int salario;
	private String dataIngresso;
	
	public Funcionario(String nome, String email, String endereco, String cpf, String telefone, int idFuncionario,
			int salario, String dataIngresso) {
		super(nome, email, endereco, cpf, telefone);
		this.idFuncionario = idFuncionario;
		this.salario = salario;
		this.dataIngresso = dataIngresso;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	

	

}
