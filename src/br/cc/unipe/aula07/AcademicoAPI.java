package br.cc.unipe.aula07;
//Para iniciar  documentação, digitar '/**' e clicar enter
/**
 * Classe responsavel por consultar dados 
 * academicos no sistema.
 * 
 * @author douglas.monteiro
 *
 */
public class AcademicoAPI {
	/**
	 * Método que retorna o nome do aluno,
	 * recebendo a matrícula como parâmetro
	 * 
	 * @param matricula <String> <li> contém informações referente a matrícula <li> principal variavel
	 * @return <String> Retorna o nome do aluno
	 * 
	 */
	public String consultarAluno(String matricula){
		
		return "Douglas Monteiro";
	}

}

//'@deprecated' serve para depreciar uma parte que pode sair do programa
/*Exemplo(Deprecated,See)
 * 
 * @deprecated
 * @see<UsaServico>
 * 
 * */
