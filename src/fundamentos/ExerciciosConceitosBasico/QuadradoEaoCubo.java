package fundamentos.ExerciciosConceitosBasico;

//Criar um programa que leia um valor e apresente os resultados 
//ao quadrado e ao cubo do valor.

public class QuadradoEaoCubo {

	public static void main(String[] args) {
		
		double valor1 = 50;
		double quadrado = Math.pow(valor1, 2);
		System.out.println("Valor ao Quadrado = "+quadrado);
		
		double valor2 = 50; 
		double cubo = Math.pow(valor2, 3);
		System.out.println("Valor ao Cubo = "+cubo);
		
	}
}
