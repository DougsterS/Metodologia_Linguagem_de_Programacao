package br.cc.unipe.aula04.exercicioI;

/* 1.Fa�a um programa que receba o valor do sal�rio de um funcion�rio e o percentual de aumento, calcule e mostre o valor do aumento e o novo sal�rio.*/

import java.util.Scanner;

public class Questao01 {
	
	private static Scanner leitor;

	public static void main(String[] args){
		
		float salario; //valor do salario do usuario
		float porcentagem;//porcentagem de aumento salarial
		float aumento;//Valor do salario apos o aumento
		
		leitor = new Scanner(System.in);
		
		System.out.println("---===={Calculador de aumento salarial}====---");
		System.out.println("Por favor, informe o valor do seu salario(R$): ");
		salario = leitor.nextFloat();//Recebe o valor equivalente ao salario
		System.out.println("Informe a porcentagem que ser� aumentada no seu sal�rio: ");
		porcentagem = leitor.nextFloat();//Recebe o valor da porcentagem
		
		aumento = salario + ((salario*porcentagem)/100);//Realiza o c�lculo de quanto ficar� o sal�rio embutido ap�s o aumento ser aplicado
		System.out.println("Recebendo " + salario + " com um aumento de " + porcentagem +"%, voc� passa a receber: R$" + aumento);
	}
}