package cursojava.executavel;

public class ArrayVetor {

	public static void main(String[] args) {
		
		// Array pode ser de todos os tipo de dados e objetos tambem
		
		//Array sempre deve ter a quantidade de posicoes definidas
		double notas[] = new double[4];
		
		 notas[0]=6;
		 notas[1]=7;
		 notas[2]=4;
		 notas[3]=9;
		 
		for(int pos=0;pos<4;pos++ ) {
			
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
		
	}
}
