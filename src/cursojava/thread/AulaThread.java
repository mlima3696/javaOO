package cursojava.thread;

public class AulaThread {
	public static void main(String[] args) {

		for(int pos=0;pos<10;pos++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Quero executar esse envio com unmtempo de parada, ou tempo determinado
			System.out.println("Executando uma rotina, envio de email");
		}
	}
}
