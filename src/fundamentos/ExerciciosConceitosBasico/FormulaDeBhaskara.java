package fundamentos.ExerciciosConceitosBasico;

public class FormulaDeBhaskara {

	//Criar um programa que resolve equações do segundo grau 
	//(ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
	//Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
	
	
	public static void main(String[] args) {
		
		double a = 1;
		double b = 12;
		double c = - 13; 
		
		double x = Math.pow(b,2) - (4 * a * c); 
		double delta = x;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 *a);
		
		System.out.println(x1);
		System.out.println(x2);
		
	}
}
