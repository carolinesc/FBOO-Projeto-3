package Delivery_Caroline_Schiavo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	public Categoria categoria;
	public Menu() {
		
	}
	public Menu(Categoria categoria) {
		this.categoria = categoria;
	}

	//metodo para exibir menu de opçoes (fora do main)	


	public void opcoes() {
		int opcao;
		int opcaocase1;
		List<ProdutoPedido> nota = new ArrayList<>();
		
		do {
			System.out.println("     ");
			System.out.println("Selecione uma opcao do nosso cardapio:");
			 System.out.println("     ");
			System.out.println("1- Pratos Principais;");
			System.out.println("2 - Bebidas;");
			System.out.println("3 - Doces;");
			 System.out.println("     ");
			Scanner entrada = new Scanner (System.in);
			opcao = entrada.nextInt();
			
			
			switch(opcao) {
			
			//PRATO PRINCIPAL SELECIONADO------------------------------------------------------------------
			
			case 1:
				System.out.println("     ");
				System.out.println("Pratos Principais:");
				System.out.println("     ");
				System.out.println("Selecione uma opcao do nosso cardapio::");
				System.out.println("     ");
				System.out.println("1- Bruschette Funghi e Brie;");
				System.out.println("2- Ricetta crostini carciofi e gorgonzola;");
				System.out.println("3- Crostini al crudo e pesche noci;");
				System.out.println("4- Torsades folhados;");
				System.out.println("0 - SAIR");
				System.out.println("    ");
				
				opcaocase1 = entrada.nextInt();
				switch(opcaocase1) {
				
				//OPCAO 1 SELECIONADA--------------------------
				 
					case 1: System.out.println("        ");
						System.out.println("-Bruschette Funghi e Brie adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-82 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
			
					
				
				//OPCAO 2 SELECIONADA--------------------------
					case 2: System.out.println("-Ricetta crostini carciofi e gorgonzola adicionado ao carrinho-");
					    System.out.println("     ");
					    System.out.println("-74 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
						
				//OPCAO 3 SELECIONADA--------------------------
					case 3: System.out.println("-Crostini al crudo e pesche noci adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-69 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
					
				
				//OPCAO 4 SELECIONADA--------------------------
					case 4: System.out.println("-Torsades folhados adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-57 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
				}
				break;
				//FIM PRATO PRINCIPAL SELECIONADO----------------------------------------------------------------
	
				// BEBIDAS SELECIONADA------------------------------------------------------------------
				
			case 2:
				System.out.println("     ");
				System.out.println("Bebidas:");
				System.out.println("     ");
				System.out.println("Selecione uma opcao do nosso cardapio::");
				System.out.println("     ");
				System.out.println("1- Sucos;");
				System.out.println("2- Agua;");
				System.out.println("3- Espumantes;");
				System.out.println("4- Limonadas");
				System.out.println("0 - SAIR");
				System.out.println("    ");
				
				opcaocase1 = entrada.nextInt();
				switch(opcaocase1) {
				
				//OPCAO 1 SELECIONADA--------------------------
				 
					case 1: System.out.println("        ");
						System.out.println("-Suco adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-12 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
					
				
				//OPCAO 2 SELECIONADA--------------------------
					case 2: System.out.println("-Agua adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-4 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
						
				//OPCAO 3 SELECIONADA--------------------------
					case 3: System.out.println("-Espumante adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-18 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
					
				
				//OPCAO 4 SELECIONADA--------------------------
					case 4: System.out.println("-Limonada adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-12 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
				}
				break;
				//FIM BEBIDA SELECIONADA----------------------------------------------------------------
				
				//DOCES SELECIONADO------------------------------------------------------------------
				
			case 3:
				System.out.println("     ");
				System.out.println("Doces:");
				System.out.println("     ");
				System.out.println("Selecione uma opcao do nosso cardapio::");
				System.out.println("     ");
				System.out.println("1- Tiramisù;");
				System.out.println("2- Gelato;");
				System.out.println("3- Cannoli;");
				System.out.println("4- Zeppole;");
				System.out.println("0 - SAIR");
				System.out.println("    ");
				
				opcaocase1 = entrada.nextInt();
				switch(opcaocase1) {
				
				//OPCAO 1 SELECIONADA--------------------------
				 
					case 1: System.out.println("        ");
						System.out.println("-Tiramisù adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-25 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
					
				
				//OPCAO 2 SELECIONADA--------------------------
					case 2: System.out.println("-Gelato adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-16 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
						
				//OPCAO 3 SELECIONADA--------------------------
					case 3: System.out.println("-Cannoli adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-22 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
					
				
				//OPCAO 4 SELECIONADA--------------------------
					case 4: System.out.println("-Zeppole adicionado ao carrinho-");
						System.out.println("     ");
						System.out.println("-18 reais-");
						System.out.println("Vamos efetuar o pagamento!");
						opcao = 0;
						break;
						
				}
				break;
				//FIM PRATO PRINCIPAL SELECIONADO----------------------------------------------------------------

			}
	} while(opcao != 0);
	}
}