package revisao02;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(5, 3, 2 ,6, 3);
		
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i) * 2);
			System.out.println(lista.get(i));
		}
	}
}
