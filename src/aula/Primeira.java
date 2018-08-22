package aula;

public class Primeira {
	public static void main(String args[]) {
		
		//variavel do tipo primitivo inteiro
		int numero = 10, numero2 = 1, total = 0;
		
		/*Operadores Matemáticos
		 * + -> Adicao
		 * - -> Subtracao
		 * * -> Multiplicacao
		 * '/' -> Divisao
		 * */
		
		total = numero * numero2;
		
		/* Operadores Lógicos
		 * 
		 *  > -> Maior que
		 *  < -> Menor que
		 * == -> igual
		 * >= -> Maior ou igual
		 * <= -> Menor ou igual
		 * != -> Diferente
		 * && -> E
		 * || -> Ou
		 * 
		 * */
		
		if(total > 10) {
			System.out.println(total);
		}else if(total == 10) {
			System.out.println("O valor é igual a 10");
		}else{
			System.out.println("O valor é inferior a 10");
		}
		
		/*Laços de repetição
		 * 
		 * */
		
		int i = 0;
		
		//Enquanto
		while(i <= 10000) {
			System.out.println("TP é maravilhoso");
			i = i + 1;
		}
		
		for(int x = 10; x > 0; x = x - 1) {
			System.out.println(x);
		}
		
	}
}