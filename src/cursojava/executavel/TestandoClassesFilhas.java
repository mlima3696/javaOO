package cursojava.executavel;

import cursojava.Aluno;
import cursojava.Diretor;
import cursojava.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Milton Lima - Programador _ Java");
		aluno.setNomeEscola("UNDB");
		
		
		Diretor diretor = new  Diretor();
		diretor.setRegistroGeral("123");
		diretor.setNome("REX");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Adm");
		secretario.setNumeroCPF("1234");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}
