package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.0;
		
		String resultadoParcial = media >=5.0 ? "Em Recuperação" : "Reprovado"; 
		String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;
		System.out.println("O resultado é : "+resultadoFinal);
		
		double nota = 7.0;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		boolean temDesconto = passouPorMedia && bomComportamento; 
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.println("Tem Desconto? "+resultado);
		
	}
}
