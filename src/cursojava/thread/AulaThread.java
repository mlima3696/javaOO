package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) {

		//Thread processando em paralelo do envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		
		
		//Thread processando em paralelo do envio de nota fiscal
				Thread threadNFCE = new Thread(thread2);
				threadNFCE.start();
				
				// Fluxo do sistema
				System.out.println("Chegou ao fim do codigo de teste de Thread");

				JOptionPane.showMessageDialog(null, "Sistema continua executando");//Fica null porque nao tem nenhum objeto Pai
																					 
			}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			// Codigo da rotina que eu quero executar em paralelo
			for (int pos = 0; pos < 10; pos++) {

				// Quero executar esse envio com unmtempo de parada, ou tempo determinado
				System.out.println("Executando uma rotina, envio de nota fiscal");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} // Fim do codigo paralelo
			
		}
	};
	
			private static Runnable thread1 = new Runnable() {

				@Override
				public void run() {
					
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

				}
			};

		}
