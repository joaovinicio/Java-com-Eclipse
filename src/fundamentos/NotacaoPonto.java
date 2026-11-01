package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s.toUpperCase(); 
		System.out.println(s); // nada acontece
		
		s = s.toUpperCase(); 
		System.out.println(s); // aqui o texto já é convertido
		
		s = s.replace("X", "João");
		s = s.concat("!!");
		System.out.println(s);
		
		String y = "Bom dia X".replace("X", "Adriana").concat("!!");
		System.out.println(y);
		
		// Os tipos primitivos não tem o operador "." 
		// Os tipos primitivos armazenam apenas o seu valor
		// Ou seja eles não possuem ações (Metodos);
		
		int a = 3;
		System.out.println(a);
		
		 
	}
}
