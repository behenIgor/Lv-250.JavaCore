package com.edu.classwork4;

public class Product {

	public static void main(String[] args) {
		
		Product product1 = new Product("Car", 5000, 6);
		Product product2 = new Product("Bicycle", 700, 12);
		Product product3 = new Product("Tank", 4000000, 3);
		Product product4 = new Product("Skateboard", 100, 50);
		
		int maxPrice = Math.max(Math.max(product1.getPrice(), product2.getPrice()), 
						 Math.max(product3.getPrice(), product4.getPrice()));
		
		int maxQuantity = Math.max(Math.max(product1.getQuantity(), product2.getQuantity()), 
				 Math.max(product3.getQuantity(), product4.getQuantity()));
		
		product1.printNameAndQuantity(maxPrice);
		product2.printNameAndQuantity(maxPrice);
		product3.printNameAndQuantity(maxPrice);
		product4.printNameAndQuantity(maxPrice);
		
		product1.printName(maxQuantity);
		product2.printName(maxQuantity);
		product3.printName(maxQuantity);
		product4.printName(maxQuantity);
		
	}
	
	private String name;
	private int price;
	private int quantity;
	
	public Product (String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	private void printNameAndQuantity(int price) {
		if (price == this.price) {
			System.out.println(this.name + " is the most expensive item." +  
					" Quantity: " + this.quantity + " units.");
		}
	}
	
	private void printName(int quantity) {
		if (quantity == this.quantity) {
			System.out.println(this.name + " has the biggest quantity.");
		}
	}

	
}
