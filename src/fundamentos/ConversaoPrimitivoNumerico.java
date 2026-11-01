package fundamentos;

public class ConversaoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1.12345678888; // Conversão Implicita
		System.out.println(a);
		
		float b = (float)1.12345678888;
		System.out.println(b); // Conversão Explicita

		// O java não analiza o Valor! Para o java o que importa é o Tipo.
		// Por mais que o número 4 caiba dentro do byte primeiro ele analiza
		// o tipo do arquivo é não seu tamanho.
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1;
		int f = (int )e;
		System.out.println(f);
		
		
		
	}
}
