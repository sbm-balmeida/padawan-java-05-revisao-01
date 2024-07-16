package revisao06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Organizacao {

	public static void main(String[] args) {
		
//		O TreeSet obriga a classe a ter o comparable
//		Set<Produto> set = new TreeSet<>();
//		set.add(new Produto("1", 1d));
//		System.out.println(set);
		
		List<Produto> lista = getProducts();
		System.out.println(lista);
		
		Ordenacao ordenacao = new Ordenacao();
		
		Collections.sort(lista, ordenacao);
		System.out.println(lista);
	}
	
	static class Ordenacao implements Comparator<Produto> {
		
		@Override
		public int compare(Produto produto, Produto produto2) {
			if (produto.getPrice() < produto2.getPrice()) {
				 return 1;
			 }
			 if (produto.getPrice() > produto2.getPrice()) {
				 return -1;
			 }
			 return 0;
		}
	}

	private static List<String> getLista() {
		return Arrays.asList("camiseta", "meia", "luva", "agasalho");
	}
	
	private static List<Produto> getProducts() {
		
		List<Produto> produtoList = new ArrayList<>();
		
		produtoList.add(new Produto("meia", 20d));
		produtoList.add(new Produto("camiseta", 10d));
		produtoList.add(new Produto("luvas", 100d));
		produtoList.add(new Produto("agasalho", 45d));
		
		return produtoList;
	}
}
