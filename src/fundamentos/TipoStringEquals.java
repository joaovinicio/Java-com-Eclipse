package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		String s = new String ("2"); 
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
//		next(); Retira os espaços em branco
		// nextLine(); não retira. precisaria usar o .trim(); para remover os espaços
		
		// Sempre que for comparar String utilize Equals.
		
		String s2 = entrada.next();
		System.out.println(s2);
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		entrada.close();
	}
}
