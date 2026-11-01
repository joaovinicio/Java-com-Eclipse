package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite uma nota");
		double nota = leitura.nextDouble();
		leitura.nextLine();

		System.out.println(nota);

		if (nota <= 10 && nota >= 7) {
			System.out.println("Aprovado");
			System.out.println("Reprovado");
		}
		if (nota < 7 && nota >= 4.5) {
			System.out.println("Recuperação");

			boolean criterioReprovacao = nota < 4.5 && nota >= 0;

			if (criterioReprovacao) {
				System.out.println("Reprovado");
			}

		}

		leitura.close();
	}
}
