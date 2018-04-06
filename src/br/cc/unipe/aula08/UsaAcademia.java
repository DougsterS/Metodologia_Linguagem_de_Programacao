package br.cc.unipe.aula08;

public class UsaAcademia {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setCpf("069");
		p.setNome("Douglas Monteiro");
		
		Funcionario f = new Funcionario();
		f.setRegistro("012");
		f.setNome("Paulinho");
		f.setCpf("234");
		
		Aluno a = new Aluno();
		a.setMatricula("194005678");
		a.setNome("Alexandra");
		a.setCpf("678");
		a.falar("Ent�o � ele, Zabuza Momochi!");//Recebendo a String 'mensagem'
		a.falar(186);//recebendo um inteiro
		
		Academia academia = new Academia();
		academia.informaNome(a);
		academia.informaNome(f);
		academia.informaNome(p);
		
		p = new Aluno();
		((Aluno)p).getMatricula();/*Nessa linha est� sendo feita uma convers�o, utilizar
		apenas quando se tem certeza que a vari�vel � do tipo que est� sendo convertido.
		No exemplo convertemos p(antes declarada como Pessoa) para a classe Aluno*/
		
		
	}
}

