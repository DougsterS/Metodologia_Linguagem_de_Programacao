package br.cc.unipe.aula08;

public class Aluno extends Pessoa {
	
	private String matricula;
	private int nota = 0;
	
	public void recebeNota(){
		if(nota==0){
			System.out.println("Reprovado!");
		}
	}
	
	@Override/*Método do JRE 1.5 usado para indicar visualmente quando utilizamos uma
	           sobrescrita, que é quando uma classe filha adiciona elementos à uma 
	           classe mãe*/
	public void falar(){
		System.out.println("Nome: " + getNome());
		System.out.println("Quero Nota!");
	}
	
	/*Sobrecarga é utilizar o mesmo método, porém recebendo parâmentros diferentes
	  como pode ser visto abaixo:*/
	public void falar(String mensagem){
		System.out.println(mensagem);
	}
	
	public void falar(int numeroMensagem){
		System.out.println(numeroMensagem);
	}
	
	public void falar(Pessoa p){
		p.falar();
		
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
