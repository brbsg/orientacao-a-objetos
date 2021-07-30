package Lojinha;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class Caixa {
	public static Scanner scan = new Scanner(System.in);
	
	public static List<Cliente> clienteArr = new ArrayList<>();
	public static List<Produto> produtoArr = new ArrayList<>();
	
	
//================================================================================
	
	
	static void gerarObjetos(){
		for(int i=0;i<10;i++) {
			var actual1 = new Cliente("Cliente" + i, "Endereco" + i, "telefone" + i);
	    	clienteArr.add(actual1);
	    }
		for(int i=0;i<10;i++) {
			var actual2 = new Produto("Produto" + i, "descricao" + i, 20 + i, i/5, i+3);
	    	produtoArr.add(actual2);
	    }
	}
	
	
	static void buscaCliente(String nome) {
		
		boolean clienteEncontrado = false;
		
		String nomeTemp = "";
		String enderecoTemp = "";
		String telefoneTemp = "";
		
	
		for(int i=0;i<clienteArr.size();i++) {
			
			if(nome.equals(clienteArr.get(i).nome)) {
			
				System.out.println(clienteArr.get(i).nome);
				System.out.println(clienteArr.get(i).endereco);
				System.out.println(clienteArr.get(i).telefone);
				
				clienteEncontrado = true;
				
				System.out.println("Deseja alterar o cadastro?(S ou N)");
				
				String varSN = scan.next();
				
				if(varSN.equals("S")) {
					clienteArr.remove(i);
					System.out.print("Digite o nome:");
	            	nomeTemp = scan.next();
	            	
	            	System.out.print("Digite o endereco:");
	            	enderecoTemp = scan.next();
	            	
	            	System.out.print("Digite o telefone:");
	            	telefoneTemp = scan.next();
	            	
				} else if(varSN == "N") {
					
				}
				
            	
            	var actual = new Cliente(nomeTemp, enderecoTemp, telefoneTemp);
            	clienteArr.add(i, actual);
				
				break;
				
			}
			

		 	
		}
		
		if(clienteEncontrado == false) {
			System.out.println("Cliente não encontrado!");
		}
	    	
	}
	
	static void buscaProduto(String nome) {
		
		String nomeTemp ="";
		String descricaoTemp = "";
		double valorCompraTemp = 0;
		double porcentLucroTemp =0;
		int qntEstoqueTemp = 0;
		 
		boolean produtoEncontrado = false;
		
		
		for(int i=0;i<produtoArr.size();i++) {
			
			if(nome.equals(clienteArr.get(i).nome)) {
			
				System.out.println(produtoArr.get(i).nome);
				System.out.println(produtoArr.get(i).descricao);
				System.out.println(produtoArr.get(i).valorCompra);
				System.out.println(produtoArr.get(i).porcentLucro);
				System.out.println(produtoArr.get(i).qntEstoque);
				
				produtoEncontrado = true;
				
				System.out.println("Deseja alterar o cadastro do produto?(S ou N)");
				
				String varSN = scan.next();
				
				if(varSN.equals("S")) {
					clienteArr.remove(i);
					System.out.print("Digite o nome do produto:");
	            	nomeTemp = scan.next();
	            	
	            	System.out.print("Digite a descricao do produto:");
	            	descricaoTemp = scan.next();
	            	
	            	System.out.print("Digite valor de compra:");
	            	valorCompraTemp = scan.nextDouble();
	            	
	            	System.out.print("Digite a porcentagem de lucro:");
	            	porcentLucroTemp = scan.nextDouble();
	            	
	            	System.out.print("Digite a quantidade em estoque:");
	            	qntEstoqueTemp = scan.nextInt();
	            	
				} else if(varSN == "N") {
					
				}
				
            	
            	var actual = new Produto(nomeTemp, descricaoTemp, valorCompraTemp, porcentLucroTemp, qntEstoqueTemp);
            	produtoArr.add(i, actual);
				
				
				break;
				
			}
		 	
		}
		
		if(produtoEncontrado == false) {
			System.out.println("Produto não encontrado!");
		}
	}
	
	static void cadastroVendas() {
		int clienteSelecionado = 0;
		int produtoSelecionado = 0;
		int qntProdutos = 0;
		int varWhile = 0;
		
		System.out.println("Selecione um cliente: ");
		for(int i=0;i<clienteArr.size();i++) {
	     	
			System.out.print(i + "-" + clienteArr.get(i).nome + '\n');
		  
		 }
		
		clienteSelecionado = scan.nextInt();
		
		
		
		while(varWhile != 1) {
			System.out.println("Selecione um produto: ");
			
			for(int i=0;i<produtoArr.size();i++) {
		     	
				System.out.print(i + "-" + produtoArr.get(i).nome + '\n');
			    
			}
			
			produtoSelecionado = scan.nextInt();
			
			System.out.println("Selecione a quantidade do produto: ");
			qntProdutos = scan.nextInt();
			
			if(qntProdutos <= produtoArr.get(produtoSelecionado).qntEstoque) {
				produtoArr.get(produtoSelecionado).qntEstoque = produtoArr.get(produtoSelecionado).qntEstoque - qntProdutos;
			}else {
				System.out.println("Quantidade invalida");
			}
			System.out.println("Digite 1 caso queira parar o cadastro de venda ou qualquer tecla para continuar");
			varWhile = scan.nextInt();
		}
		
		
	}
	
	static void mostrarProdutos() {
		for(int i=0;i<clienteArr.size();i++) {
	     	
			System.out.print(clienteArr.get(i).nome);
			System.out.print(" - Quantidade: " + produtoArr.get(i).qntEstoque + '\n');
		     	
		 }
	}
	
	
//================================================================================
	
	
    public static void main(String[] args) {
    	
    	int menuVar = 0;
    	
    	gerarObjetos();

    	while(menuVar != 7){
            System.out.println
            ("\n################## LOJINHA DO BARBOSA ##################");
            
            System.out.println("1 - Cadastro de novo cliente");
            System.out.println("2 - Busca por cliente");
            System.out.println("3 - Cadastro de novo produto");
            System.out.println("4 - Busca por produto");
            System.out.println("5 - Cadastro de venda");
            System.out.println("6 - Mostrar produtos em estoque");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");
            
            menuVar = scan.nextInt();
           
            switch (menuVar) {
                case 1:
                    int qntPessoas = 0;
                    System.out.print("Digite a quantidade de pessoas:");
                    qntPessoas = scan.nextInt();
                	
                    for(int i=0;i<qntPessoas;i++) {
                    	System.out.print("Digite o nome:");
                    	String nome = scan.next();
                    	
                    	System.out.print("Digite o endereco:");
                    	String endereco = scan.next();
                    	
                    	System.out.print("Digite o telefone:");
                    	String telefone = scan.next();
                    	
                    	var actual = new Cliente(nome, endereco, telefone);
                    	clienteArr.add(actual);
                    	
                    }
                    
                
                    break;
                    
                case 2:
                	System.out.print("Digite o nome do cliente:");
                    String nomeCliente = scan.next();
                   
                	buscaCliente(nomeCliente);
                	
                    break;
                    
                case 3:
                	 int qntProdutos = 0;
                     System.out.print("Digite a quantidade de pessoas:");
                     qntProdutos = scan.nextInt();
                 	
                     for(int i=0;i<qntProdutos;i++) {
                     	System.out.print("Digite o nome do produto:");
                     	String nomeProduto = scan.next();
                     	
                     	System.out.print("Digite a descricao do produto:");
                     	String descricao = scan.next();
                     	
                     	System.out.print("Digite o valor de compra do produto:");
                     	double valorCompra = scan.nextDouble();
                     	
                     	System.out.print("Digite a porcentagem de lucro:");
                     	double porcentLucro = scan.nextDouble();
                     	
                     	System.out.print("Digite a quantidade em estoque:");
                     	int qntEstoque = scan.nextInt();
                     	
                     	var actual = new Produto(nomeProduto, descricao, valorCompra, porcentLucro, qntEstoque);
                     	produtoArr.add(actual);
                     	
                     }
                     
    
                    break;
                    
                case 4:
                	System.out.print("Digite o nome do cliente:");
                    String nomeProduto = scan.next();
                   
                	buscaProduto(nomeProduto);
            	
                    break;
                    
                case 5:
                    cadastroVendas();
                    break;
                    
                case 6:
                    mostrarProdutos();
                    break;

                case 7:
                	
                    break;
            }
            
        }
    	scan.close();
    	System.out.print("\n\n ----- Sistema Encerrado ----- \n\n");
       
        
    }
}