package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Bom dia".charAt(2));
		String nome = "Bom dia"; 
		nome = nome.concat("!!!");
		System.out.println(nome);
		
		String texto = "Curso de Java 2026";
		String resultado = texto.toLowerCase(); // transforma letras maiusculas em minusculas;
		System.out.println(resultado);
		System.out.println(nome.equals("Bom dia!!!"));
		System.out.println(nome.equalsIgnoreCase("bom dia!!!"));
		
		// startsWith verifica se e verdadeiro ou falso! Boolean
		
		// lenght retorna a posição do número (inteiro) 
		
		// endsWith retorna verdadeiro ou false; Boolean
		
		var nome1 = "Adriana";
		var sobrenome = "De Jesus";
		var idade = 51;
		var salario = 12354.890;
		System.out.println("Nome : "+nome1 + "\nSobrenome : "+sobrenome);
		System.out.println("Idade : "+idade+"\nSalário R$ "+salario);
		
		System.out.printf("O Sr(@) %s %s tem %d, de idade!\nSeu salário atual é R$ %.3f",nome,sobrenome,idade,salario);
		System.out.println();
		
		/*
		 * Posso Ter a Mesma Funcionalidade do printf utilizando uma String 
		 * Veja o Exemplo Abaixo utilizando a String frase = string.format
		 * */
		
		String frase = String.format("O Sr(@) %s %s tem %d, de idade!\nSeu salário atual é R$ %.3f",nome,sobrenome,idade,salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6)); // vai incluir a palavra toda
		System.out.println("Frase qualquer".substring(6, 10)); // ele não vai incluir o caracter 10
		
				
	}
}
