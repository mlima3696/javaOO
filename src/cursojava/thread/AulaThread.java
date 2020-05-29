package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) {

		//Thread processando em paralelo
		new Thread() {

			public void run() {// Executa o que nos queremos
				// Codigo da rotina

				// Codigo da rotina que eu quero executar em paralelo
				for (int pos = 0; pos < 10; pos++) {

					// Quero executar esse envio com unmtempo de parada, ou tempo determinado
					System.out.println("Executando uma rotina, envio de email");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} // Fim do codigo paralelo

			};

		}.start();// Start liga a thread que fica processando paralelamente por tras

		System.out.println("Chegou ao fim do codigo de teste de Thread");
		// Fluxo do sistema

		JOptionPane.showMessageDialog(null, "Sistema continua executando");// Fica null porque nao tem nenhum objeto Pai
	}
}
