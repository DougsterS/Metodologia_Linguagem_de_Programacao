package br.cc.unipe.aula09.exercicioII;
/**
 * 
 * @author Douglas A. Monteiro Alcantara Justino
 * Classe responsável por conter os menus do programa.
 *
 */
public class Menu {
/**
 * Menu principal
 */
	public void menu(){
		
		System.out.println("1 - Inicializar Vetor");
		System.out.println("2 - Preencher Manualmente o Array");
		System.out.println("3 - Preencher todos os vetores com valor o [45]");
		System.out.println("4 - Imprimir Array [Valor]");
		System.out.println("5 - Consultar elemento");
		System.out.println("9 - Sair");
		
	}
/**
 * Menu de impressão de Arrays
 */
	public void menuImpressao(){
		System.out.println("1 - Imprimir com For");
		System.out.println("2 - Imprimir com While");
		System.out.println("3 - Imprimir com ToString");
	}

}