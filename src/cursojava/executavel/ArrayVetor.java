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
		aluno.setNome("Lima");
		aluno.setNomeEscola("XY");
		
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
		
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do Aluno = " + aluno.getNome() + " Inscrito no curso: " +aluno.getNomeEscola());
		System.out.println("-------------------------Disciplinas do Aluno---------------------------------");
		
		for(Disciplina disc : aluno.getDisciplinas()) {
			
			System.out.println();
			System.out.println("Disciplina: " + disc.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			double notaMax=0;
			for(int pos =0;pos<disc.getNota().length;pos++) {
				System.out.println("Nota " + pos + " é = " +disc.getNota()[pos]);
				if(pos==0) {
					notaMax=disc.getNota()[pos];
				}else {
					if(disc.getNota()[pos] > notaMax) {
						notaMax=disc.getNota()[pos];
					}
				}
			} System.out.println("Maior da disciplina = " + disc.getDisciplina() + " e de valor: " + notaMax);
		}
	}
}
