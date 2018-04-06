package br.cc.unipe.aula08;

public class Funcionario extends Pessoa {
	
	private String registro;
	private int tipo = 0;
	
	public void recebeSalario(){
		if(tipo==0){
			System.out.println("Tá pobre!");
		}
		
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	
}
