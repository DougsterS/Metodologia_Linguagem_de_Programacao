package br.cc.unipe.aula06;

public class Cliente {
	
	public static float juros = 0.5f;
	public int outraIdade;
	
	private String nome;
	private String endereco;
	private char sexo;
	private int idade;
	
	public Cliente(){//Construtor
		System.out.println("Iniciando Construtor");
	}
	
	private void brinde(){
		if(this.idade>=18){
			System.out.println("Já pode ser preso!");
		}
	}
	
	//Métodos utilizados para acessar as variáveis privadas com outras classes
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
		brinde();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String novoNome){
		
		nome = novoNome;
		
	}
}