package oopinrtro;

public class Product {
	
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int Id,String name,double unitPrice, String detail) {
		this.Id = Id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	}
	
    int Id;
	String name;
	double unitPrice;
	String detail;
  
}
