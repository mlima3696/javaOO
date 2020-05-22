package cursojava.executavel;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Array pode ser de todos os tipo de dados e objetos tambem
		
		//Array sempre deve ter a quantidade de posicoes definidas
		String posicoes = JOptionPane.showInputDialog("Quantas posicoes o Array deve ter: ");
		double notas[] = new double[Integer.parseInt(posicoes)];
		
		for(int pos=0;pos<notas.length;pos++) {//Lenght enquanto a posicao for menor que o Array 
			String valor = JOptionPane.showInputDialog("Qual o valor da posicao = " +pos);
			notas[pos]= Double.valueOf(valor);
		}
		 
		for(int pos=0;pos<notas.length;pos++ ) {
			
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
		
	}
}
