package br.cc.unipe.aula07;
//Para iniciar  documenta��o, digitar '/**' e clicar enter
/**
 * Classe responsavel por consultar dados 
 * academicos no sistema.
 * 
 * @author douglas.monteiro
 *
 */
public class AcademicoAPI {
	/**
	 * M�todo que retorna o nome do aluno,
	 * recebendo a matr�cula como par�metro
	 * 
	 * @param matricula <String> <li> cont�m informa��es referente a matr�cula <li> principal variavel
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
