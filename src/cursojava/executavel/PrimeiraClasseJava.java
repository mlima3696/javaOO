package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.classesauxiliares.FuncaoAutenticacao;
import cursojava.Aluno;
import cursojava.Diretor;
import cursojava.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// new Aluno() e uma instancia (criacao do objeto)
		// aluno1 e uma referencia para o objeto aluno
		
		try {
		
		String login = JOptionPane.showInputDialog("Qual e o Login? ");
		String senha = JOptionPane.showInputDialog("Qual e a Senha? ");
		
		
		// Pode ser tambem o secretario
		if (new FuncaoAutenticacao(new Diretor(login,senha)).autenticar()) { //Vou travar o contrato para autorizar somente quem realmente tem o contrato legal

			List<Aluno> alunos = new ArrayList<Aluno>();

			// E uma lista que dentro dela temos uma chave que identifica a sequencia de
			// valores tambem
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int quant = 1; quant <= 1; quant++) {

				String nome = JOptionPane.showInputDialog("Nome do aluno " + quant + " ? ");
				String idade = JOptionPane.showInputDialog("Idade do aluno? ");
				/*
				 * String DataN=JOptionPane.showInputDialog("Data de nascimento do Aluno? ");
				 * String RG=JOptionPane.showInputDialog("N�mero de RG do Aluno? "); String
				 * CPF=JOptionPane.showInputDialog("N�mero do CPF do Aluno? "); String
				 * Mae=JOptionPane.showInputDialog("Nome da Mae do Aluno?"); String
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
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);// Passando de String para Int

						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
					}

				}

				System.out.println("Aqui o ERRO!");
				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {// Separei em listas
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}

			}

			System.out.println(
					"----------------------------Lista dos Aprovados------------------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome do Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

			System.out.println();
			System.out.println(
					"----------------------------Lista  de Recuperação---------------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome do Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

			System.out.println();
			System.out.println(
					"-----------------------------Alunos de Reprovados--------------------------------------- ");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome do Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

				sc.close();
			} else {
				JOptionPane.showMessageDialog(null, "Acesso Negado!");
				

			}
		
		} catch (Exception e) {
			
			StringBuilder saida = new StringBuilder();
			
			// Imprime erro no console Java 
			e.printStackTrace();
			
			//Mensagem do erro ou causa
			System.out.println("Mensagem: " + e.getMessage());
			
			for(int pos=0; pos<e.getStackTrace().length;pos++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());//Classe de Erro
				saida.append("\n Metodo de erro: " + e.getStackTrace()[pos].getMethodName());//Metodo do Erro
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());// Linha do Erro
				saida.append("\n Class : " + e.getClass().getName());
			}
			
			JOptionPane.showMessageDialog(null, "Erro ao processar notas: " + saida.toString());
		}
	}

}