package Ejercicios01;

import java.util.ArrayList;
import java.util.Iterator;

public class MediaArray {
	
	public static int mediaLista() {
		int suma = 0;
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(4);
		listaNumeros.add(10);
		listaNumeros.add(12);
		listaNumeros.add(2);
		listaNumeros.add(8);
		
		for (Iterator iterator = listaNumeros.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			suma = suma + integer;
		}
			
		int media = suma/listaNumeros.size();
		return media;

	}
}
