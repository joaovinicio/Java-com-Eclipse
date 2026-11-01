package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String numero1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String numero2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		double valor1 = Double.parseDouble(numero1);
		double valor2 = Double.parseDouble(numero2);
		
		double soma = valor1 + valor2;
		System.out.println("A soma é : "+soma);
		System.out.println("A média é : "+soma /2);
		
	}
}
