package br.cc.unipe.aula09.exercicioII;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Douglas A. Monteiro Alcantara Justino
 * Classe contendo os métodos que serão utilizados no programa Principal
 *
 */
public class ManipulaVetores {
	
	Scanner leitor = new Scanner(System.in);
	
	public int[] inicializarVetor(){
		/**
		 * Método responsável por Inicializar o vetor e projetar o tamanho total do Array		 * 
		 */
		System.out.println("Inicializando vetor");
		int valor = obterValor();//Resgata o valor do método "obterValor"
		int[] retorno = new int[valor];//Inicializa o valor disponibilizado pelo usuário em tamanho de Array
		System.out.println("Vetor inicializado com " + valor + " elementos");
		
		return retorno;
	
	}
	
	public int[] preencherVetor(int[] vetor, int valor){
		/**
		 * Método responsável por permitir ao usuário
		 * preencher manualmente todas as posições do array		 * 
		 */
		for(int contador =0; contador<vetor.length; contador++){/*O loop serve para evoluir posições
		 														e requisitar valores para atribuir a tais posições
		 														no array. Enquanto a variável contador for menor
		 														que a largura do array, o laço se repete 
		 														adicionando sempre + 1 ao contador.*/
			System.out.println("Informe um valor para colocar na " + (contador+1) + "ª Posição");
			valor = leitor.nextInt();
			vetor[contador] = valor;//Local onde o valor disponibilizado pelo usuário é atribuido a posição do contador
			System.out.println("Valor " + valor + " preenchido com sucesso na " + (contador+1) + "ª Posição");
		}
		System.out.println("Preenchimento manual concluído.");
		return vetor;
	}
	
	public void imprimirVetor(int[] vetor, int tipo){
		/**
		 * Método responsável por imprimir na tela
		 * o array que está sendo trabalhado no programa.		 * 
		 */
		int i = 0;
		if (tipo==1){//Imprime os valores do array usando FOR
			for(i = 0; i<vetor.length; i++){
				System.out.println("["+vetor[i]+"]");
			}
		}
		
		if(tipo == 2){//Imprime os valores do array usando While
			i = 0;
			while(i<vetor.length){
				System.out.println("["+vetor[i]+"]");
				i++;
			}
		}
		
		if (tipo == 3) System.out.println("[" + Arrays.toString(vetor) + "]");//Imprime os valores do array usando TOSTRING
		
	}
	
	public int consultarElemento(int[] vetor, int elementoBusca){
		/**
		 * Método responsável por receber um valor do usuário 
		 * e percorrer o array em busca do valor requisitado		 * 
		 */
		System.out.println("Informe o elemento que deseja procurar no array:");
		elementoBusca = leitor.nextInt();
		for(int i =0; i < vetor.length; i++){//Laço responsável por percorrer todo o array
			if (vetor[i]==elementoBusca) {/*Caso seja encontrado o valor requisitado em alguma posição do array
			 								o programa realiza esse if informando que o valor está presente no array*/
				System.out.println("O valor " + elementoBusca + " ESTÁ presente no array!");
				return i;
			} 
		}
		System.out.println("O valor " + elementoBusca + " NÃO ESTÁ presente no array!");/*Caso não seja encontrado
		 																				o valor requisitado na range
		 																				do array, o laço de repetição
		 																				se encerra e o usuário é 
		 																				notificado.*/
		return -1;
	
	}
	
	public int obterValor(){
		/**
		 * Método responsável por adquirir um valor do usuário
		 * e exportá-lo para que o método "inicializarVetor" 
		 * possa usufruir de seu valor
		 * 
		 */
		int valor = -1;
		System.out.println("Informe o valor: ");
		while(true){
			valor = leitor.nextInt();
			if (valor > 0)
				break;//Encerra o método no momento que o usuário informa um valor maior que 0
			else
				System.out.println("Informe um valor maior que zero:");/*Caso seja informado um número negativo, 
																		o programa requisita ao usuário 
																		um valor maior que zero*/
		}
		
		return valor;
	}
	
	public int preencher45(int[] vetor) {
		/**
		 * Método responsável por preencher todas as posições do array
		 * com o valor 45
		 * 
		 */
		Arrays.fill(vetor, 45);
		System.out.println("Todos os valores foram preenchidos com o valor [45]");
		return 0;
	}

}