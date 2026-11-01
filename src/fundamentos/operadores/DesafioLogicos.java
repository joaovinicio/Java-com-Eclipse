package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu nome!");
		String nome = leitura.nextLine();
		System.out.println("Olá, Seja Bem Vindo Sr(@): "+nome);
		
		System.out.println("Você Trabalhou Terça-Feira? (sim/não)");
		String trabalhoTerca = leitura.nextLine();

		System.out.println("Você Trabalhou Quinta-Feira? (sim/não)");
		String trabalhoQuinta = leitura.nextLine();
		
		Boolean tv50 = trabalhoTerca.equalsIgnoreCase("sim");
		Boolean tv32 = trabalhoQuinta.equalsIgnoreCase("sim");
		
		Boolean sorvete = tv32 || tv50; 
		
		if(tv50 && tv32) {
			System.out.println("Você trabalhou 2 dias! Tem dinheiro para comprar "
					+ "a TV de 50 polegadas e também para tomar sorvete!");
		}
		else if(tv50 || tv32) {
			System.out.println("Você trabalhou 1 dia! Tem dinheiro para comprar "
					+ "a TV de 32 polegadas e também para tomar sorvete!");
		}else {
			System.out.println("Você não Trabalhou nenhum dia!\n"
					+ "Sem dinheiro para comprar"
					+" a Tv\né não tomará Sorvete! Porém você fica mais Saúdavel.");
		}
		
		Boolean tomouSorvete = sorvete;
		String statusDoSorvete = tomouSorvete ? "sim" : "não";
		System.out.println("Você tomou Sorvete? "+statusDoSorvete);
		
		leitura.close();
		
	}
}
