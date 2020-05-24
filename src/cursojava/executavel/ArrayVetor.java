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
		
		double[] notas = {2,3.4,4,8,6};
		double[] notasLogica = {5.3,6.5,7.8,9};
		
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);// Adicionando uma disciplina para um aluno
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Zabbix");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		//---------------------------------------------------------------------------------
		
		Aluno[]arrayAlunos = new Aluno[1];
		
		arrayAlunos[0]=aluno;
		for(int pos=0;pos<arrayAlunos.length;pos++) {
			System.out.println("Nome do Aluno é: " + arrayAlunos[pos].getNome());
			
			for(Disciplina disc : arrayAlunos[pos].getDisciplinas()) {
				System.out.println();
				System.out.println("Noma da Disciplina: " +disc.getDisciplina());
				double notaMax=0;
				for(int posnota=0;posnota<disc.getNota().length;posnota++) {
					System.out.println("A nota numero: " +posnota+ " é igual = " +disc.getNota()[posnota]);
					if(pos==0) {
						notaMax=disc.getNota()[posnota];
					}else {
						if(notaMax <disc.getNota()[posnota]) {
							notaMax = disc.getNota()[posnota];
						}
					}
				}
				System.out.println("A nota maxima é: " + notaMax);
			}
		}
	}

}
