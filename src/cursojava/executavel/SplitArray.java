package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String texto ="Lima,Curso Docker,80,90,99";
		
		String[] valoresArray=texto.split(",");
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota: " + valoresArray[2]);
		System.out.println("Nota: " + valoresArray[3]);
		System.out.println("Nota: " + valoresArray[4]);
		
		//Convertendo um Array em uma lista
		
		List<String> list=Arrays.asList(valoresArray);
		
		System.out.println();
		for (String valorString : list) {
			System.out.println(valorString);
				
		// Converter uma lista para Array
			System.out.println();
			String[] conversaoArray=list.toArray(new String[5]);
			for(int pos=0;pos<conversaoArray.length;pos++) {
				System.out.println(conversaoArray[pos]);
			}
			
		}
	}

}
