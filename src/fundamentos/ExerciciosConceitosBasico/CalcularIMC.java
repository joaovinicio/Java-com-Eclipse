package fundamentos.ExerciciosConceitosBasico;

import java.util.Scanner;

// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

public class CalcularIMC {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = leitura.nextDouble();
		leitura.nextLine();
		 
		System.out.println("Infome seu peso: ");
		double peso = leitura.nextDouble(); 
		leitura.nextLine();
		
		double imc = Math.pow(altura, 2);
		System.out.println("O IMC é = "+ peso/imc);
		
		leitura.close();
	}

}
