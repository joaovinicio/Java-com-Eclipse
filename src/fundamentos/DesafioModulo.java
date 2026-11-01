package fundamentos;

import javax.swing.JOptionPane;

public class DesafioModulo {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite um valor"); 
		String operador = JOptionPane.showInputDialog("Qual operação deseja usar? + - * / %");
		String valor2 = JOptionPane.showInputDialog("Digite outro valor"); 
		
		Double num1 = Double.parseDouble(valor1); 
		Double num2 = Double.parseDouble(valor2);
		
		double resultado = 0;
		resultado =  "+".equals(operador) ? num1 + num2 : resultado;
		resultado =  "-".equals(operador) ? num1 - num2 : resultado;
		resultado =  "*".equals(operador) ? num1 * num2 : resultado;
		resultado =  "/".equals(operador) ? num1 / num2 : resultado;
		resultado =  "%".equals(operador) ? num1 % num2 : resultado;
		
		JOptionPane.showMessageDialog(null, "Resultado = "+resultado);
		System.out.printf("%s %s %.2f = %.2f",num1, operador, num2, resultado);
	}
}
