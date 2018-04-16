package br.cc.unipe.aula09.exercicioII;

import java.util.Scanner;
/**
 * 
 * @author Douglas A. Monteiro Alcantara Justino
 * Classe principal de execução do programa
 * Programa correspondente para as Questões 1,2 & 3 do exercício de Arrays
 *
 */

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Menu menu = new Menu();
		ManipulaVetores manipulaVetores = new ManipulaVetores();
		int opcao = 0;
		int[] vetor = null;
		int elementoBusca = 0;
		int valor = 0;
		
		while(true){
			menu.menu();
			opcao = manipulaVetores.obterValor();
			
			switch (opcao) {
			
			case 1://Inicializa o Array
				vetor = manipulaVetores.inicializarVetor();
				break;
			
			case 2://Preenche o vetor manualmente
				manipulaVetores.preencherVetor(vetor, valor);
				break;
			
			case 3://Preenche todas as posições do vetor com o valor 45
				manipulaVetores.preencher45(vetor);
				break;
				
			case 4:
				menu.menuImpressao();//Imprime na tela os valores
				int tipo = manipulaVetores.obterValor();
				manipulaVetores.imprimirVetor(vetor, tipo);
				break;
				
			case 5://COnsulta os elementos presentes no vetor
				manipulaVetores.consultarElemento(vetor, elementoBusca);
				break;
				
			case 9://Sai do programa
				System.exit(0);
				break;

			default:
				break;
			}
			
		}
	}

}
