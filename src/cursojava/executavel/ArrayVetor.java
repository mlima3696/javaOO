package cursojava.executavel;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//double[] valores = {9.5,3.3,6.3}; // pos 0 1 2
		
		//String[]valores = new String[4];
		/*valores[0] = "lima";
		valores[1] = "qwe";
		valores[2] = "rty";
		valores[3] = "uio";*/
		
		int[] inteiros = new int[10];
		float[] floats = new float[10];
		
		String[]valores = {"lima","qwe","rty","uio"};
        for(int pos=0;pos<valores.length;pos++ ) {
			
			System.out.println("Valor na posicao " + pos  + " é = " + valores[pos]);
		}
		
	}
}
