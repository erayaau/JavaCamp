package inheritance2;

public class FileLogger extends Logger{
	@Override //üzerine yazmak
	public void log() {
		System.out.println("Dosya loglandý");
	}


}
