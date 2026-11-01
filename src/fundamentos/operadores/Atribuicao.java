package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b; 
		
		c+= b; // c = c + b;
		c-= b; // c = c - b;
		c*= b; // c = c * b;
		c/= b; // c = c / b;
		
		System.out.println(c);

		c %= 2; // c % 2; 0 ou 1;
		System.out.println(c);
		
		int valor = 13;
		System.out.println(Integer.toString(valor));
		
		Integer num1 = 23;
		num1.toString();
		System.out.println(num1);
	}
}
