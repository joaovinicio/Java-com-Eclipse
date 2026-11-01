package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leitura = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o primeiro Salário");
		String valor1 = leitura.nextLine().replace(",", ".");
		 
		System.out.println("Digite o segundo Salário");
		String valor2 = leitura.nextLine().replace(",", ".");
		
		System.out.println("Digite o Terceiro Salário");
		String valor3 = leitura.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1+salario2+salario3; 
		System.out.println("A soma dos salários é : "+soma);
		System.out.println("A média dos salários é : "+soma/3); 
		
		System.out.println(Locale.getDefault());
		leitura.close(); 
	}
}
