package revisao03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProgramaSet {

	public static void main(String[] args) {
		
		Set<Integer> listaSet;
		
		listaSet = new HashSet<>();
		listaSet.add(1);
		listaSet.add(3);
		listaSet.add(null);
		listaSet.add(null);
		listaSet.add(1);
		
		print(listaSet);
	}

	private static void print(Set<Integer> item) {
		
		Iterator<Integer> iterador = item.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}

	
}
