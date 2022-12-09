package models;

public class Item {
	private String name;
	private Double price;
	private Integer quantityInStock;
	
	public Item() {};
	
	public Item(String name, Double price, Integer quantity){
		this.name = name;
		this.price = price;
		this.quantityInStock = quantity;
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

	public Integer getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	
}
