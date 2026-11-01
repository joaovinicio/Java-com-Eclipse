package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a +1;
		a--; // a = a -1;
		
		++b; // b = b +1; 
		--b; // b = b -1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); // Aki o resultado sera a = 2 é b = 1 = false
		System.out.println(a == b); // false 
		System.out.println(a); // 1 
		System.out.println(b); // 2
		
	}
}
