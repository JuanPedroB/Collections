package Ejercicios01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.w3c.dom.stylesheets.MediaList;

class Tests {

	@Test
	void testMediaArray() {
		int media = 7;
		
		assertEquals(media, MediaArray.mediaLista());
	}

	@Test
	void testRevertirLista() {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(2);
		lista.add(5);
		lista.add(4);
		lista.add(7);
		lista.add(8);
		lista.add(9);
			
		System.out.println(lista);
		System.out.println(RevertirLista.revertirLista());
		assertEquals(lista, RevertirLista.revertirLista());
	}
	

}