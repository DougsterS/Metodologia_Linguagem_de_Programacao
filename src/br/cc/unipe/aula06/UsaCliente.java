package br.cc.unipe.aula06;

public class UsaCliente {
	
	public static void main(String[] args){
		Cliente.juros = 0.8f;
		
		Cliente c = new Cliente();
		c.juros=0.6f;
		Cliente c2 = new Cliente();
		System.out.println(c2.juros);
		Cliente c3 = new Cliente();
		Cliente c4 = new Cliente();
		c4.juros =0.9f;
		Cliente c5 = new Cliente();
		System.out.println(c.juros);
		System.out.println(c4.juros);
		//juros é estático, por isso, o valor utilizado ou modificado será o mesmo para todos os utilizados
		c.setIdade(18);
	}
}