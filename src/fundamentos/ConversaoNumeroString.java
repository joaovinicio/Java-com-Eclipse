package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		int naoSei = 1789;
		System.out.println(Integer.toString(naoSei));
		
		Integer pt = 13;
		System.out.println(pt.toString());
		
	}
}
