package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM"); //referans olu�turma, instan
		
		
		Product product2 = new Product(); 
		product2.Id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 17000;
		product2.detail = "32 GB RAM";
		
		Product product3 = new Product(); 
		product3.Id = 3;
		product3.name = "HP 5";
		product3.unitPrice = 18000;
		product3.detail = "8 GB RAM";
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.Id = 1;
		category1.name ="Bilgisayar";
		
		Category category2 = new Category();
		category2.Id = 2;
		category2.name ="Tablet";
		
		ProductManager productManager = new ProductManager();
			productManager.addToCart(product1);
			
			productManager.addToCart(product2);
		
			productManager.addToCart(product3);
		
		
	  }

}
