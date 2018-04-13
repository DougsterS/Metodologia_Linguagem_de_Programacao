package br.cc.unipe.aula09.exercicioII;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Menu menu = new Menu();
		ManipulaVetores manipulaVetores = new ManipulaVetores();
		int opcao = 0;
		int[] vetor = null;
		
		while(true){
			menu.menu();
			opcao = manipulaVetores.obterValor();
			
			switch (opcao) {
			case 1:
				vetor = manipulaVetores.inicializarVetor();
				
				break;
				
			case 2:
				menu.menuImpressao();
				int tipo = manipulaVetores.obterValor();
				manipulaVetores.imprimirVetor(vetor, tipo);
				break;
				
			case 9:
				System.exit(0);
				break;

			default:
				break;
			}
			
		}
	}

}
