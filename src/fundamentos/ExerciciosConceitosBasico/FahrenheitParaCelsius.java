package fundamentos.ExerciciosConceitosBasico;

//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

public class FahrenheitParaCelsius {
	
	public static void main(String[] args) {
		
		double formula = 5.0 / 9.0;
		double temperaturaFahrenheit = 48;
		final double ajuste = 32;
		
		double resultado = (temperaturaFahrenheit - ajuste) * formula;
		System.out.println(resultado);
		
	}
}
