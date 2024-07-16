package revisao06;

public class Produto implements Comparable<Produto>{
	
	private String name;
	private Double price;

	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Produto{" + "name='" + name + '\'' + ", price=" + price + '}';
	}
	
	@Override
	public int compareTo(Produto produto) {
		 if (this.getPrice() < produto.getPrice()) {
			 return -1;
		 }
		 if (this.getPrice() > produto.getPrice()) {
			 return 1;
		 }
		 return 0;
	}
	
}
