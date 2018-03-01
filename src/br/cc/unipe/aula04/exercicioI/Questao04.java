package br.cc.unipe.aula04.exercicioI;

import java.util.Scanner;

public class Questao04 {
	
	/*4.	Uma empresa decidiu dar 20% de aumento aos funcion�rios cujos sal�rios s�o inferiores a 500 reais. 
	 * Escreva um programa que leia o sal�rio de v�rios funcion�rios se mostre o valor do sal�rio reajustado ou uma mensagem caso o 
	 * funcion�rio n�o tenha direito ao aumento. O programa ser� encerrado quando se digitar �fim� para o nome do funcion�rio. (Comando while)*/
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		
		String nome;
		float salario;
		int opcao = 1;
		
		leitor = new Scanner(System.in);
		System.out.println("---==={Consulta de aumento salarial}===---");
		System.out.println("Nossa empresa ir� conceder um aumento de 20% para todos os funcion�rios que possuirem um sal�rio");
		System.out.println("abaixo de R$500.00.");
		while (opcao ==1 ) {
			System.out.println("Qual o seu nome?");
			nome = leitor.next();
			System.out.println("Qual � o seu salario atual?");
			salario = leitor.nextFloat();
			if(salario > 500) {
				System.out.println(nome + ", infelizmente voc� n�o est� apto a receber aumento!");
				System.out.println("Seu salario atual de R$" + salario +" ultrapassa o limite de R$500.00");
				System.out.println("Deseja fazer a requisi��o de outro funcionario?");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				opcao = leitor.nextInt();
			} else {
				System.out.println(nome + " voc� est� apto ao reajuste salarial");
				System.out.println("Voc� receber� um aumento salarial equivalente a R$" + (salario*20/100));
				System.out.println("Apartir de hoje seu salario equivale a R$" + (salario + (salario*20/100)));
				System.out.println("Deseja fazer a requisi��o de outro funcionario?");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				opcao = leitor.nextInt();
			}
		}
		System.out.println("Obrigado pela compreens�o e por utilizar o software de nossa empresa.");
	}
}
