package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o dia da Semana");
		String dia = leitura.nextLine();
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		}

		else if ("Segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}

		else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("Quarta".trim())) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("Quinta".trim())) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("Sexta".trim())) {
			System.out.println(6);
		} else{ 
			if(dia.equalsIgnoreCase("Sabado")){
				System.out.println(7);					
				}
			else{
				System.out.println("Dia Inválido");
				}
			}
		
		leitura.close();
	}
}
