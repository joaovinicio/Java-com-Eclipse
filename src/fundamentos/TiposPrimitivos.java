package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		// Informações do Funcionário
		
		// Tipos númericos Inteiros;
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos númericos Reais
		
		float salario = 11_445.44F; 
		double vendasAcumulados = 2_991_797_103.01;
		
		// Tipo Boolean 
		
		boolean estaDeFerias = true;
		
		// Tipo Caracter
		
		char ativo = 'S'; 
		
		// Dias de Empresa;
		
		System.out.println("Dias de empresa: "+ anosDeEmpresa * 365);
		
		// Número de Viagens
		
		System.out.println("Número de Voos "+ numerosDeVoos / 2);
		
		// Pontos por Vendas! Ou seja para cada real vendido ele acumula pontos. 
		
		System.out.println("Os Pontos Acumulados é : "+pontosAcumulados / vendasAcumulados);
		
		System.out.println("O id : "+id+" Ganha : "+salario);
		System.out.println("O Funcionário está de Ferias? "+estaDeFerias);
		System.out.println("O Funcionário está ativo na Empresa? "+ativo); 
	}

}
