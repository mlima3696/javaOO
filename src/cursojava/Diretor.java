package cursojava;

import cursojava.interfaces.PermitirAcesso;

// Classe filha de pessoa que extende pessoa
public class Diretor extends Pessoa implements  PermitirAcesso{

	private String registroEducacao;
	private int tempoDirecao;
	private String titula�ao;
	
	private String login;
	private String senha;
	
	public  Diretor(String login, String senha) {
		this.login=login;
		this.senha=senha;
	}
	
	public Diretor() {
		
	}
	
	
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
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3800;
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login=login;
		this.senha=senha;
		return autenticar();
	}
	
	@Override
	public boolean autenticar() {
		return login.equals("admin1")&&senha.equals("admin1"); // Titular
	}
	
	
	
}
