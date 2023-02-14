package entities;

public class OrderItem_2 {

	
	private Integer quantity;
	private Double price;
	
	private Product_2 product;
	
	public OrderItem_2() {
		
	}

	public OrderItem_2(Integer quantity, Double price, Product_2 product) {
		
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product_2 getProduct() {
		return product;
	}

	public void setProduct(Product_2 product) {
		this.product = product;
	}
	
	
	public double subTotal() {
		
		return price * quantity;
		
	}
	
	@Override
	public String toString() {
		
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+", Subtotal: $"
				+ String.format("%.2f", subTotal());
				
		
	}
	
	
	
}
