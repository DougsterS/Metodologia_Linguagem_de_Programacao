package br.cc.unipe.aula09.exercicioII;

import java.util.Scanner;

/**
 * 
 * @author Douglas A. Monteiro Alcantara Justino
 *3.Crie um programa que receba 10 valores e depois permita 
 *que seja feita uma pesquisa por tal valor, ordene a lista e faça uma pesquisa Binária 
 *de forma que ela retorne o indice se o mesmo existir no array.
 *
 */

public class Questao03 {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		
		int [] meuArray;
		meuArray = new int[10];
		int contador;
		int valor;
		int aux = 0;
		
		
		leitor = new Scanner(System.in);
		System.out.println("Informe valores para preenchimento");
		
		for(contador = 10; contador > 0; contador--) {
			System.out.println("Faltam " + contador + " Valore(s)");
			System.out.println("Informe um valor:");
			valor = leitor.nextInt();
			meuArray[aux] = valor;
			aux++;
		}
		
		aux = 0;
		valor = 0;
		contador = 0;
		while(aux == 0) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Digite um valor para procurar dentro do Array: ");
			valor = leitor.nextInt();
		}
	}
}