package assign1.p2;

public class Product {
	private int productId;
	private String name;
	private int price;
	
	
	
	public Product() {
		
	}
	
	
	
	public Product(int productId, String name, int price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}



	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
