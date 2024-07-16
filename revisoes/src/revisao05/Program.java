package revisao05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> carros = new ArrayList<>();
		
		carros.add("HRV");
		carros.add("Polo");
		carros.add("Golf");
		carros.add("City");
		carros.add("Cruze");
		carros.add("Argo");
		carros.add("Ka");
		
		System.out.println(carros);
		
		Iterator<String> iterador = carros.iterator();
		
		while (iterador.hasNext()) {
			String carro = iterador.next();
			if (carro == "Argo") {
				iterador.remove();
			}
		}
		System.out.println(carros);
	}
}
