package Ejercicios01;

import java.util.ArrayList;
import java.util.LinkedList;

public class RevertirLista {

	public static LinkedList<Integer> revertirLista() {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.add(5);
		lista.add(4);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(2);
		
		lista.addFirst(lista.pollLast());
		
		return lista;
	}
}
