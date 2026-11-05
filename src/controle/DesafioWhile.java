package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double nota=0;
		double quantidade=0;
		double total=0;
		
		while(nota!=-1) {
			System.out.println("Digite uma nota válida (ou -1 para sair):");
			nota = teclado.nextDouble();
			teclado.nextLine();
			
			if(nota == -1) {
				
			}
			else if(nota >=0 && nota <=10) {
				total+=nota;
				quantidade++;
				
			}else {
				System.out.println("Nota inválida!");
			}
		}
			if(quantidade >0) {
				
				double media = total / quantidade;
				
				System.out.printf("\nA quantidade de notas válidas é: %.0f\n", quantidade);
				System.out.printf("A Média final é = %.2f\n", media);
				
			} else {
				System.out.println("\nNenhuma nota válida foi digitada.");
		}
			

		teclado.close();

	}
}
