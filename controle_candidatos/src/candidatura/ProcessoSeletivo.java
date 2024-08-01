package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		//selecaoCandidatos();
		//imprimirSelecionados();
		
		// Simulando ligação para candidatos selecionados
		String[] candidatos = {"FELIPE", "MARCIA","JULIA", "PAULO", "AUGUSTO"};
		for (String candidato: candidatos) {
			entrandoEmContato(candidato);
			
		}
		
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
			 
		} while (continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com o candidato " + candidato + " número de tentativas " + tentativasRealizadas);
		} else {
			System.out.println("Não conseguimos contato com " + candidato + " número de tentativas " + tentativasRealizadas);
		}
	}
	
	//Método auxiliar
	static	boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	
	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE", "MARCIA,","JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for (int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de n° " + (i+1) + " é " + candidatos[i]);
		}
		
		System.out.println("Forma abreviada de interação forEach");
		
		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	
	
	
	
	
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA,","JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase =  2000.0;
		
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretentido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	
	
	static void analisarCandidatos(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para candidato");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		} else  {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
	
	
	// Função que retorna uma valor entre 1800 - 2200 de forma aleatoria 
	
	static double valorPretentido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
}
