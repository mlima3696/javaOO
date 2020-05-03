package cursojava;

// Classe filha de pessoa que extende pessoa
public class Diretor extends Pessoa {

	private String registroEducacao;
	private int tempoDirecao;
	private String titula�ao;
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitula�ao() {
		return titula�ao;
	}
	public void setTitula�ao(String titula�ao) {
		this.titula�ao = titula�ao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titula�ao="
				+ titula�ao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	
	
}
