package cursojava.executavel;

import java.util.Locale;
import java.util.Scanner;

import cursojava.Aluno;
import cursojava.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Criacao dos alunos
		Aluno aluno = new Aluno();
		aluno.setNome("Lima, Gomes");
		aluno.setNomeEscola("Null");
		
		// Criacao das disciplinas
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Docker");
		
		double[] notas = {2,3.4,4,4,4};
		double[] notasLogica = {5.3,6.5,7.8,9};
		
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);// Adicionando uma disciplina para um aluno
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Zabbix");
		disciplina2.setNota(notasLogica);
	}
}
