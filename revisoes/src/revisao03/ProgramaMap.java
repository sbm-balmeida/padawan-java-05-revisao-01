package revisao03;

import java.util.HashMap;
import java.util.Map;

public class ProgramaMap {

	public static void main(String[] args) {
		
		Map<String, Integer> listaMap;
		
		listaMap = new HashMap<>();
		listaMap.put("joão", 20);
		listaMap.put(null, 40);
		listaMap.put(null, 50);
		if (!listaMap.containsKey("joão")) {
			listaMap.put("joão", null);
		}
		listaMap.put("carlos", null);
		listaMap.put("pedro", 55);
		
		
		
		print(listaMap);
	}

	private static void print(Map<String, Integer> item) {
		
		item.forEach((chave, valor) -> {
			System.out.println("chave: " + chave + ", valor: " +valor);
		});
	}

}
