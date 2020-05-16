package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception{
	public ExcecaoProcessarNota(String erro) {
		super("Erro no processamento do ArquivoX " + erro);
	}
}
