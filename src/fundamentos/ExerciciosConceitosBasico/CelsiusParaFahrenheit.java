package fundamentos.ExerciciosConceitosBasico;


//  Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
 
public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		double formula = 9.0 / 5.0;
		final double ajuste = 32;
		double temperatura = 45;
		
		double resultado = (temperatura * formula) + ajuste;
		System.out.println("A temperatura em Fahrenheit é : "+resultado);
	}
}
