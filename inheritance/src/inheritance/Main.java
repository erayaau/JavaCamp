package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="123654";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
	    hepsiBurada.customerNumber="212454";   
	    
	    UnionCustomer abc = new UnionCustomer();
	    abc.customerNumber="999999";
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin, abc , hepsiBurada};
		
		
		customerManager.addMultiple(customers);
		
	}	
}
