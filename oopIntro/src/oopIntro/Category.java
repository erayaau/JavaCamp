package oopIntro;

public class Category {
	 private int Id ;
	 private String name;
	 
     
	 public Category(int Id, String name) {
		this.Id = Id;
		this.name = name;
	}

	public Category() {
		
	}

	public int getId() {
		 return this.Id;
	 }
	
	 public void  setId(int Id) {
		 this.Id = Id;
	 }
     
	 public String getName() {
		 return name + "!";
	 }
    
	 public void setName(String name) {
		 this.name = name;
	 }
	 
}	 
