package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//musteri ekleme kodlarý
		System.out.println("Müsteri eklendi");
		
		logger.log();
	}
}

//Bir iþ yapan sýnýf baþka iþ yapan sýnýf kullanýcaksa 
//asla somut sýnýf kullanýlmaz bu kodlar NEWLENEMEZ!