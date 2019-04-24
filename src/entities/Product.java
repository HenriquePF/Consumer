package entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
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
	
	// Reference Method with Static Method
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);		
	}
	// Reference Method with non static method
	public void nonStaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
	}
	
	//toString generated automatically
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}	
}
