package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//musteri ekleme kodlar�
		System.out.println("M�steri eklendi");
		
		logger.log();
	}
}

//Bir i� yapan s�n�f ba�ka i� yapan s�n�f kullan�caksa 
//asla somut s�n�f kullan�lmaz bu kodlar NEWLENEMEZ!