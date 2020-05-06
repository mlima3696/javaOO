package cursojava.interfaces;

// Essa interface sera o nosso contrato de autenticao
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
}
