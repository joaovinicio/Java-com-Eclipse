package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Olá, você precisa digitar a palavra"
			+ "\nmágica para sair do programa.");
			
			texto = leitura.nextLine();

		} while (!texto.equalsIgnoreCase("por favor"));

		leitura.close();
	}
}
