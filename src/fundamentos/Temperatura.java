package fundamentos;

public class Temperatura {

	public static void main(String[] args) {

		final double ajuste = 32;
		final double formula = 5.0 / 9.0;

		double fahrenheit = 86.0;
		double temperatura = (fahrenheit - ajuste) * formula;
		System.out.println("A temperatura em Celsius é : " + temperatura + "ºC");
 
		fahrenheit = 150;
		temperatura = (fahrenheit - ajuste) * formula;
		System.out.println("À temperatura em Celsius é : " + temperatura);

	}
}
