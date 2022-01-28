import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Forca {
	public static Scanner scan = new Scanner(System.in);
	
	public static List<Theme> themeArr = new ArrayList<>();
	
	//================================================================================
	
	static void gerarThemes(){
		for(int i=0;i<10;i++) {
			var actual = new Theme("Tema" + i);
			themeArr.add(actual);
	    }
		for(int i=0;i<10;i++) {
			themeArr.get(i).words.add("Palavra" + i);
	
	    }
	}

	//================================================================================
	
	public static void main(String[] args) {
		gerarThemes();
		
		Scanner scan = new Scanner(System.in);
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("----------------- Jogo Da Forca -----------------");
			System.out.println("1.Gerenciar Temas"); 
			System.out.println("2.Gerenciar Palavras");
			System.out.println("3.Jogar");
			System.out.println("4.Sair");
			System.out.print("Opção: ");
			
			String sel = scan.nextLine();
			
			switch(sel) {
				case "1":
					manageThemes();
					
					break;
				//======================================
				case "2":
					manageWords();
					break;
				//======================================	
				case "3":
					
					break;
				//======================================
				case "4":
					
					exit = true;
					break;
				//======================================
	
	
				default:
					exit = true;
				
			}
		}
		
		
		scan.close();
    	System.out.print("\n\n ----------------- Sistema Encerrado ----------------- \n\n");
	}
	
	//================================================================================
	
	static void manageWords() {
		System.out.println("----------------- Gerenciar Palavras -----------------");
		System.out.println("1.Cadastro");
		System.out.println("2.Exclusão");
		System.out.println("3.Busca");
		System.out.println("4.Listagem");
		
		
		
		String sel = scan.nextLine();
		
		switch(sel) {
			case "1":
				
				boolean exit1 = false;
				
				System.out.println("Escolha um tema ou pressione 0 para sair.");
				
				for(int i=0;i<themeArr.size();i++) {
					System.out.print(i + ".");
					System.out.println(themeArr.get(i).title);
				}
				
				String themeScan  = scan.nextLine();
				
				while(!exit1) {
					System.out.print("Adicionando palavras ao tema:");
					System.out.println(themeArr.get(Integer.parseInt(themeScan)).title);
					System.out.println("Digite 0 para sair.");
					
					String wordScan  = scan.nextLine();
					
					themeArr.get(Integer.parseInt(themeScan)).words.add(wordScan);
					
					if(wordScan.equals("0")) {exit1 = true;}
					
				}
				
				break;
			//======================================
			case "2":
				
				
				
				break;
			//======================================	
			case "3":
				
				
				break;
			//======================================
			
	
			default:
				break;
			
			
		}
	
	}
	
	//================================================================================
	
	static void manageThemes() {
		System.out.println("----------------- Gerenciar Temas -----------------");
		System.out.println("1.Cadastro");
		System.out.println("2.Exclusão");
		System.out.println("3.Busca");
		
		
		
		String sel = scan.nextLine();
		
		switch(sel) {
			case "1":
				
				boolean exit1 = false;
				
				while(!exit1) {
					System.out.println("Digite um tema ou pressione 0 para sair.");
					String themeScan  = scan.nextLine();
					
					if(themeScan.equals("0")) {
						exit1 = true;
					}else if(themeArr.size() <= 50 && !themeScan.equals("")) {
						boolean repeated = false;
						
						for(int i=0;i<themeArr.size();i++) {
							if(themeArr.get(i).title.equals(themeScan)) {
								repeated = true;
							}
						}
						
						if(!repeated) {
							var actual = new Theme(themeScan);
							themeArr.add(actual);
						}else {
							System.out.println("Esse tema já existe. Digite um tema novo!!!");
						}
					}
				}
				
				break;
			//======================================
			case "2":
				
				boolean exit2 = false;
				
				while(!exit2) {
					String themeScan  = scan.nextLine();
					System.out.println("Digite um tema a ser excluído ou pressione 0 para sair.");
					
					if(themeScan.equals("0")) {
						exit2 = true;
					}else if(themeArr.size() <= 50 && !themeScan.equals("")) {
						boolean founded = false;
						
						for(int i=0;i<themeArr.size();i++) {
							if(themeArr.get(i).title.equals(themeScan)) {
								themeArr.remove(i);
								
								founded = true;
							}
						}
						
						if(!founded) {
							System.out.println("“Não foi possível excluir o tema. Verifique se existem palavras cadastradas nesse tema!!!");
						}
					}
				}
				
				break;
			//======================================	
			case "3":
				
				boolean exit3 = false;
				
				System.out.println("Lista de Temas");
				
				for(int i=0;i<themeArr.size();i++) {
					System.out.print(i + ".");
					System.out.println(themeArr.get(i).title);
				}
				
				
				String themeScan  = scan.nextLine();
				System.out.println("Pressione 0 para sair.");
				
				if(themeScan.equals("0")) {exit3 = true;}
				while(!exit3) {}
				
				break;
			//======================================
			
	
			default:
				break;
			
			
		}
	
	}
	
	//================================================================================
}
