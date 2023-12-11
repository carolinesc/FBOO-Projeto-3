package Delivery_Caroline_Schiavo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Atividades_Caroline_Schiavo.Pao;

public class TesteDelivery {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Sistema Delivery Le restaurant!");
		System.out.println("        ");
		
		Cliente cli1 = new Cliente();
		System.out.println("Adicione seus dados! Informe seu nome:");
		cli1.setNome(entrada.next());    
		 System.out.println("Agora informe seu telefone:");
		cli1.setTelefone(entrada.nextDouble());
		 System.out.println("Agora informe seu CEP para franquia mais proxima:");
		cli1.setCep(entrada.nextDouble());
		System.out.println("      ");
		System.out.println("Seus dados foram registrados!");
		System.out.println("      ");
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Telefone: " + cli1.getTelefone());
		System.out.println("Cep: " + cli1.getCep());
		System.out.println("      ");
		
		System.out.println("Encontramos um restaurante 'Le restaurant' proxima a voce!");
		System.out.println("Avaliacao ***** 5 estrelas");
		System.out.println("      ");
		System.out.println("      ");
		
		
   	
		 Menu m1 =  new Menu();

		 m1.opcoes(); 
		 
		 Produto cliente = new Produto();
		 System.out.println("Insira seu nome: ");
		 cliente.setNome(entrada.next());
		 System.out.println("Insira seu CPF: ");
		 cliente.setCep(entrada.nextInt());
		 System.out.println("Insira seu Endereco: ");
		 cliente.setEndereco(entrada.next());
		 System.out.println("Insira a Quantidade desejada: ");
		 cliente.setQuantidade(entrada.nextInt());
		 System.out.println("Insira seu Telefone: ");
		 cliente.setTelefone(entrada.nextInt());
		 System.out.println("Insira o valor total: ");
		 cliente.setValor(entrada.nextInt());
		 System.out.println("Precisa de troco? para quanto?");
		 cliente.setTroco(entrada.nextDouble());
		 System.out.println("     ");
		 System.out.println("Taxa de entrega = 6 reais.");

			List<ProdutoPedido> nota = new ArrayList<>();

			nota.add(cliente);

		for (ProdutoPedido exiba: nota) {
			
			System.out.println("     ");
			System.out.println("Nome:");
			System.out.println (exiba.getNome());
			System.out.println("    ");
			System.out.println("Cep:");
			System.out.println (exiba.getCep());
			System.out.println("    ");
			System.out.println("Endereco:");
			System.out.println (exiba.getEndereco());
			System.out.println("    ");
			System.out.println("Quantidade:");
			System.out.println (exiba.getQuantidade());
			System.out.println("    ");
			System.out.println("Telefone:");
			System.out.println (exiba.getTelefone());
			System.out.println("    ");
			System.out.println("Valor Total:");
			System.out.println (exiba.getValor());
			System.out.println("    ");
			System.out.println("Nota para troco:");
			System.out.println (exiba.getTroco());
			System.out.println("    ");
			
			Motoboy entregador = new Motoboy();
			entregador.entregar();
			
			System.out.println("    ");
			System.out.println("Obrigada pela preferencia! Seu pedido chegara logo!");
			System.out.println("    ");
			System.out.println("Voce voltou ao menu principal!");
			 m1.opcoes(); 
			}

	}

}
