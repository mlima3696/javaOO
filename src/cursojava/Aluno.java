package cursojava;

//Esta e nossa classe/objeto que o Aluno

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {
	
	private String datamatricula;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplina>  disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() { //Cria os dados na memoria = Sendo padr�o do Java

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	// Veremos os metodos SETTRERS e GETTERS do objeto
	// SET � para adicionar ou receber dados para os atributos
	// GET � para resgatar ou obter o valor do atributos
	// This faz referencia a classe dos atributos

	//Recebe dados
	public void setNome(String nome) {		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDatamatricula() {
		return datamatricula;
	}

	public void setDatamatricula(String datamatricula) {
		this.datamatricula = datamatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}


	// Metodo que retorna a media do Aluno
	public double getMediaNota() {

		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}

		return somaNotas/disciplinas.size();//Conta a quantidade de discipplinas (Retorna um inteiro que e o tamanho da lista
	}// Acessando o objeto de outra classe

	// Metodo que retorna true para Aprovado e false para Reprovado
	public boolean getAlunoAprovado() {
		double media=this.getMediaNota();
		if(media >=7) {
			return true;
		}else {
			return false;
		}
	}			

	//Metodo que retorna se esta aprovado ou n�o baseado se a media � maior ou igual a 7
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 7) {
			return StatusAluno.APROVADO;
		}else if(this.getMediaNota() >=3 && this.getMediaNota() <7) {
			return StatusAluno.RECUPERACAO;
		}else {	
			return StatusAluno.REPROVADO ;
		}
	}
	
	
	


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", datamatricula=" + datamatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}



	//Compara��o entre atributos do objeto para saber se os atributos de A = B
	// Selecionar os atributos que seram comparados

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCPF == null) ? 0 : numeroCPF.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCPF == null) {
			if (other.numeroCPF != null)
				return false;
		} else if (!numeroCPF.equals(other.numeroCPF))
			return false;
		return true;
	}
	
	
	@Override // Identifica metodo sobreescrito (Ja existi na superclasse)
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Aluno e maior de de idade " : "Negativo";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 800;
	}

	}