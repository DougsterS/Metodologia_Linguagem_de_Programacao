package br.cc.unipe.aula08;
/**
 * 
 * @author Douglas A. Monteiro Alcantara Justino
 *
 */

public class Pessoa {

	private String nome;
	private String cpf;
	

	public void falar(){
		System.out.println("Meu nome é: " + getNome());
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


}
