package cursojava.executavel;

import cursojava.Aluno;
import cursojava.Diretor;
import cursojava.Pessoa;
import cursojava.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Milton Lima - Programador _ Java");
		aluno.setNomeEscola("UNDB");
		aluno.setIdade(22);
		
		
		Diretor diretor = new  Diretor();
		diretor.setRegistroGeral("123");
		diretor.setNome("REX");
		diretor.setIdade(51);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Adm");
		secretario.setNumeroCPF("1234");
		secretario.setIdade(33);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		aluno.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		
		System.out.println();
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
	}
	

	Aluno aluno2 = new Aluno();
	
	
	
}
