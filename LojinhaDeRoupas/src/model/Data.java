package model;

//import java.util.*;

/**
 * Armazenar todos os dados da aplica��o
 * @author Lucas & Gustavo
 * @version 1.0 (abril 2022)
 */
public class Data {
	// private ArrayList<Loja> lojas = new ArrayList<Loja>();
	private Client[] clients = new Client[50];
	private int amountOfClients = 0;
	private Employee[] employee = new Employee[50];
	private int amountOfEmployees = 0;
	
	private Telefone[] tels = new Telefone[50];
	private int qtdTels = 0;
	private Store[] store = new Store[5];
	private int amountOfStores = 0;
	private Purse[] purse = new Purse[50];
	private int amountOfPurses;
	private Sale[] sales = new Sale[50];
	private int amountOfSales;

	/**
	 * Gera numeros aleat�rios ao entrar no aplicativo
	 * @param name
	 * @param endereco
	 * @param dataPrimC
	 * @param numID
	 * @param cPF
	 * @param numTel
	 */
	public void fillWithSomeData() {
		amountOfClients = 5;
		amountOfEmployees = 5;

		qtdTels = 5;
		amountOfStores = 1;
		amountOfPurses = 5;
		amountOfSales = 5;
		
		for (int i = 0; i < 5; i++) {
			tels[i] = new Telefone((i + 1) * 10, (i + 1) * 100000001);
			clients[i] = new Client("Cliente" + i, "Endereco" + i, "08/3" + (i + 1) + "/2000", (i + 1),
					(i + 1) + "1234567899", tels[i]);
			employee[i] = new Employee("Funcionario" + i, "Endereco" + i, i , "1234567899" + (i + 1),i , tels[i]);
			
			purse[i] = new Purse(i, "Bolsa"+i, "azul", "Bolsa", "Gucci",null , 19900, "Alcântara");
			
			sales[i] = new Sale(i, "Cliente" + i, "Funcionario" + i, "venda" + (i + 1), "Bolsa", i );
		}

		store[0] = new Store("Lojinha da Esquina", "endereco tal rua tal", 72001480, new Telefone(61, 999907676));

	}

	public Client[] getClientes() {
		return clients;
	}

	public void setClientes(Client[] clientes) {
		this.clients = clientes;
	}

	public void insertClient(Client c, int pos) {
		this.clients[pos] = c;
		if (pos == amountOfClients)
			amountOfClients++;
	}

	public int getAmountOfClients() {
		return amountOfClients;
	}

	public void setAmountOfClients(int amountOfClients) {
		this.amountOfClients = amountOfClients;
	}

	public Employee[] getEmployees() {
		return employee;
	}

	public void setEmployees(Employee[] employee) {
		this.employee = employee;
	}

	/**
	 * Cadastrar o cliente
	 * @param c
	 * @param pos
	 */
	public void insertEmployee(Employee p, int pos) {
		this.employee[pos] = p;
		if (pos == amountOfEmployees)
			amountOfEmployees++;
	}

	public int getAmountOfEmployees() {
		return amountOfEmployees;
	}

	public void setAmountOfEmployees(int amountOfEmployees) {
		this.amountOfEmployees = amountOfEmployees;
	}


	public Telefone[] getTels() {
		return tels;
	}

	public void setTels(Telefone[] tels) {
		this.tels = tels;
	}

	public int getQtdTels() {
		return qtdTels;
	}

	public void setQtdTels(int qtdTels) {
		this.qtdTels = qtdTels;
	}

	public Store[] setStore() {
		return store;
	}

	public void setStore(Store[] store) {
		this.store = store;
	}

	public int getAmountOfStores() {
		return amountOfStores;
	}

	public void setAmountOfStores(int amountOfStores) {
		this.amountOfStores = amountOfStores;
	}

	/**
	 * Cadastrar a loja
	 * @param c
	 * @param pos
	 */
	public void insertStore(Store l, int pos) {
		this.store[pos] = l;
		if (pos == amountOfStores) {
			amountOfStores++;
		}
	}
 
	public Purse[] getPurse() {
		return purse;
	}

	public void setPurse(Purse[] purse) {
		this.purse = purse;
	}

	public int getAmountOfPurses() {
		return amountOfPurses;
	}

	public void setAmountOfPurses(int qntLentes) {
		this.amountOfPurses = qntLentes;
	}

	/**
	 * Cadastrar a Bolsa
	 * @param c
	 * @param pos
	 */
	public void insertPurse(Purse purse, int parseInt) {
		this.purse[parseInt] = purse;
		if (parseInt == amountOfPurses)
			amountOfPurses++;
	}

	public void setAmountOfSales(int amountOfSales) {
		this.amountOfSales = amountOfSales;
	}

	public int getAmountOfSales() {
		return amountOfSales;
	}

	public Sale[] getSales() {
		return sales;
	}

	public void insertSale(Sale v, int parseInt) {
		System.out.println("penis");
		this.sales[parseInt] = v;
		if (parseInt == amountOfSales)
			amountOfSales++;
	}

}