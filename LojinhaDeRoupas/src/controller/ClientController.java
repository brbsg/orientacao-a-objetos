package controller;
import model.*;

/**
 * Controlador de client
 * @author Lucas & Gustavo
 * @version 1.0 (Abril 2022)
 */
public class ClientController {
	private Client[] c;
	private int amountOfClients;
	
	public ClientController(DataController d) {
		c = d.getClients();
		amountOfClients = d.getAmountOfClients();
		
	}
	
	public String[] getClientName() {
		String[] s = new String[amountOfClients];
		for(int i = 0; i < amountOfClients; i++) {
			s[i] = c[i].getName();
		}
		
		return s;
	}
	
	public int getAmount() {
		return amountOfClients;
	}

	public void setAmount(int qtd) {
		this.amountOfClients = qtd;
	}
	
	public String getName(int i) {		
		return c[i].getName();
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(c[i].getCPF());
		return numCPF;
	}
	
	public String getID(int i) {
		String numID = String.valueOf(c[i].getNumID());
		return numID;
	}
	
	public Telefone getTelefone(int i) {
		return c[i].getNumTel();
	}

	public void setAmountOfClients(int amountOfClients) {
		this.amountOfClients = amountOfClients;
	}
	
	
	public String getEndereco(int i) {		
		return c[i].getEndereco();
	}	
	
}