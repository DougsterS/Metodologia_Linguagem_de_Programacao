package br.cc.unipe.aula09.exercicioII;

import java.util.Arrays;//API para manipulação de Arrays

/**
 * 
 * @author Douglas A. Monteiro Alcantara Justino
 * Questões:
 *1.Crie um array de inteiros com 300 posições e preencha todos com o valor 45.
 *2.Imprima todos os valores da questão anterior de 3 formas diferentes.
 *
 */

public class Questao0102 {
	
	public static void main(String[] args) {
		/**
		 * Função onde será realizado
		 * todos os processos referentes a questão
		 */
		
		int [] meuArray;
		int i;
		meuArray = new int[300];
		
		Arrays.fill(meuArray, 45);//
		/**
		 * Questão número 1 feita
		 * Array de tamanho 300 preenchido com o número 45
		 */
		System.out.println("Primeira Impressão");
		for(i=0; i < 300; i++){
			System.out.print(meuArray[i] + " ");
		}
		System.out.println(" ");
		
		System.out.println("Segunda Impressão: ");
		for(i=0; i < 300; i++){
			System.out.print(meuArray[i] + "///");
		}
		System.out.println(" ");

		System.out.println("Terceira Impressão: ");
		i = 0;
		while (i < 300){
			System.out.print(meuArray[i] + "-");
			i++;
		}
		/**
		 * Questão número 2 feita
		 * Impressão de Array de 3 formas distintas
		 */
	}
}
