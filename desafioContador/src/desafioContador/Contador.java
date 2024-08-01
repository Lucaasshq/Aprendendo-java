package desafioContador;

import java.util.Arrays;
import java.util.Scanner;

import parametroInvalidoException.ParametroInvalidoException;

public class Contador {
	
	public static void main(String[] args) {
	try 
		
	(Scanner scanner = new Scanner(System.in)) {
		System.out.println("Digite o primeiro parâmetro");
		int p1 = scanner.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int p2 = scanner.nextInt();
		
		try {
			
			 int[] resultado = contar(p1, p2);
			 System.out.println(Arrays.toString(resultado));
			 System.out.println("Interações:" +resultado.length);
			
		} catch (ParametroInvalidoException e) {
			System.out.println("Erro: " + e.getMessage());
			
			
		}
	}
		
		
		
	} 
	
	static int[] contar(int p1, int p2) throws ParametroInvalidoException {
		if (p1 > p2) {
			throw new ParametroInvalidoException();
		} else {
			int contagem = p2 - p1;
			int[] array = new int[contagem];
			
			for (int i = 0; i < contagem; i++) {
				array[i] = p1 + i;
			}
			return array;
			
			}
			
			
		}
		
		
	}
	
	
	
	


