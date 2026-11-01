package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite a palavra chave para Sair.");
		
		String palavra = "";
		
		while(!palavra.equalsIgnoreCase("sair")) {
			
			palavra = leitura.nextLine();
			System.out.println("Palavra chave incorreta,"
					+ " Digite a palavra correta \npara sair do programa..");
		}
		System.out.println("Fim.");
		leitura.close();
	}
}
