package br.cc.unipe.aula09.exercicioII;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulaVetores {
	
	public int[] inicializarVetor(){
		System.out.println("Inicializando vetor");
		int valor = obterValor();
		int[] retorno = new int[valor];
		System.out.println("Vetor inicializado com " + valor + " elementos");
		
		return retorno;
	
	}
	
	public int[] preencherVetor(int[] vetor, int valor){
		
		for(int contador =0; contador<vetor.length; contador++){
			vetor[contador] = valor;
		}
		return vetor;
	}
	
	public void imprimirVetor(int[] vetor, int tipo){
		int i = 0;
		if (tipo==1){
			for(i = 0; i<vetor.length; i++){
				System.out.print("["+vetor[i]+"]");
			}
		}
		
		if(tipo == 2){
			i = 0;
			while(i<vetor.length){
				System.out.print("["+vetor[i]+"]");
			}
		}
		
		if (tipo == 3) System.out.print("[" + Arrays.toString(vetor) + "]");
		
	}
	
	public int consultarElemento(int[] vetor, int elementoBusca){
		
		for(int i =0; i < vetor.length; i++){
			if (vetor[i]==elementoBusca)
				return i;
		}
		
		return -1;
	
	}
	
	public int obterValor(){
		int valor = -1;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o número: ");
		while(true){
			valor = leitor.nextInt();
			if (valor > 0)
				break;
			else
				System.out.println("Informe um valor maior que zero:");
		}
		
		return valor;
	}

}
