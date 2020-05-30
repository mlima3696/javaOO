package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread  extends JDialog{

	public TelaTimeThread() {//Executa o que tiver dentro no momento da abertura ou execucao
		
		setTitle("Tela de Time com Thread"); 
		setSize(new Dimension(480,480));
		setLocationRelativeTo(null);
		setResizable(false);
		//Primeira Parte
		
		
		
		
		//Sempre sera o ultimo a ser executado
		setVisible(true);// Torna a tela visivel para o Usuario
	}
}
