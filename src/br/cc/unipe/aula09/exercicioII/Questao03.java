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
		/**
		 * Recebe os 10 valores e os posiciona 
		 * em posições diferentes do Array
		 * 
		 */
		
		valor = 0;
		contador = 0;
		while(contador == 0) {
			System.out.println("Digite um valor para procurar dentro do Array: ");
			valor = leitor.nextInt();
			
			for(aux = 0; aux < 10 ; aux++){
				if(meuArray[aux] == valor){
					System.out.println("O valor " + valor + " está presente na lista, na posição: " + aux);
				}
			}
			/**
			 * 
			 * Usuário procura um valor específico dentro do Array
			 * 
			 */
			
			System.out.println("Deseja procurar mais um valor na lista?");
			System.out.println("0 - Sim");
			System.out.println("1 - Não");
			contador = leitor.nextInt();
		}
		
		System.out.println("Obrigado por utilizar nosso programa!");
	}
}