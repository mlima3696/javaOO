package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.Aluno;
import cursojava.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// new Aluno() � uma inst�ncia (cria��o do objeto)
		// aluno1 � uma referencia para o objeto aluno

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int quant = 1; quant <= 2; quant++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno "+quant+" ? ");
			String idade = JOptionPane.showInputDialog("Idade do aluno? ");
			/*
			 * String DataN=JOptionPane.showInputDialog("Data de nascimento do Aluno? ");
			 * String RG=JOptionPane.showInputDialog("N�mero de RG do Aluno? "); String
			 * CPF=JOptionPane.showInputDialog("N�mero do CPF do Aluno? "); String
			 * Mae=JOptionPane.showInputDialog("Nome da M�e do Aluno?"); String
			 * Pai=JOptionPane.showInputDialog("Nome do Pai do Aluno?"); String
			 * DataM=JOptionPane.showInputDialog("Data da matricula do Aluno? "); String
			 * NomeE=JOptionPane.showInputDialog("Nome da escola do Aluno?");
			 */
			String SerieM = JOptionPane.showInputDialog("Serie que o Aluno esta matriculado?");
			// String disc1=JOptionPane.showInputDialog("Disciplina 1? ");
			// String N1=JOptionPane.showInputDialog("Nota1 do Aluno? ");
			// String disc2=JOptionPane.showInputDialog("Disciplina 2? ");
			// String N2=JOptionPane.showInputDialog("Nota2 do Aluno? ");
			/*
			 * String disc3=JOptionPane.showInputDialog("Disciplina 3? "); String
			 * N3=JOptionPane.showInputDialog("Nota3 do Aluno? ");2 String
			 * disc4=JOptionPane.showInputDialog("Disciplina 4? "); String
			 * N4=JOptionPane.showInputDialog("Nota4 do Aluno? ");
			 */

			Aluno aluno1 = new Aluno(); // Joao
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade)); // Passando de String para Int
			/*
			 * aluno1.setDataNascimento(DataN); aluno1.setRegistroGeral(RG);
			 * aluno1.setNumeroCPF(CPF); aluno1.setNomeMae(Mae); aluno1.setNomePai(Pai);
			 * aluno1.setDatamatricula(DataM); aluno1.setNomeEscola(NomeE);
			 * aluno1.setSerieMatriculado(SerieM);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ? ");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ? ");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina1(nomeDisciplina);
				disciplina.setNota1(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir alguma disciplina? ");

			if (escolha == 0) { // Opcao Sim e Zero

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane
							.showInputDialog("Qual disciplina voce deseja excluir 1,2,3 ou 4? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao); // Passando de String para Int
																											
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
				}

			}
			
			alunos.add(aluno1);
			
		}
		
		for(int pos=0;pos<alunos.size();pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			if (aluno.getNome().equalsIgnoreCase("lima")) {
				
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado!");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina1("PHP");
				disciplina.setNota1(9);
				
				trocar.getDisciplinas().add(disciplina);
				alunos.set(pos, trocar);
				aluno=alunos.get(pos);
				
			}
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Media do Aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			
			for(int posd=0; posd < aluno.getDisciplinas().size();posd++) {
				
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Materia = " +disc.getDisciplina1() + " nota = " + disc.getNota1());
				System.out.println("-----------------------------------------------------------------------------------");
			}
			
		
		}
	
		sc.close();
	}

}