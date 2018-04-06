package br.cc.unipe.aula08;

public class UsaArrays {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		numeros[10] = 9;
		//Erro de Compilação = Erro que aparece na compilação
		//Erro de Execução = Erro que aparece após o arquivo ser executado
		
		String frase = "Era um vez";
		
		String[] palavras = frase.split(" ");
		
		Pessoa[] pessoas = new Pessoa[100];
		
	}

}
