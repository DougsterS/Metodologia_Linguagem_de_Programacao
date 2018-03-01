package br.cc.unipe.aula04.exercicioI;

import java.util.Scanner;

/*3.	Faça um programa em Java que permita ao usuário escolher a tabuada que deseja ver. Mostrar a tabuada escolhida. (Comando for)*/

public class Questao03 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
	
		leitor = new Scanner(System.in);
		System.out.println("---==={Tabuada de Multiplicação}===---");
		int num;
		int num2;
		int opcao = 1;
		while (opcao == 1 ) {
			System.out.println("Informe abaixo qual tabuada deseja consultar:");
			num = leitor.nextInt();//Recebe o valor da tabuada
			System.out.println("Informe abaixo qual será o ultimo valor multiplicado:");
			num2 = leitor.nextInt();//Recebe o valor de onde a tabuada termina
			for (int i = num; i<=num; i++){
				System.out.println ("Tabuada do: "+i);
				for (int j = 1; j<=num2; j++)
					System.out.println (i+" x "+j+" = "+ i*j);
			}
			System.out.println("Deseja consultar uma nova tabuada?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			opcao = leitor.nextInt();
		}
		System.out.println("Obrigado por utilizar a Tabuada de multiplicação!");
	}	
}