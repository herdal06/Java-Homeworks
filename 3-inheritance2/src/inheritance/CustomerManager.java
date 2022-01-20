package inheritance;

public class CustomerManager {
	public void  add(Logger logger) {
		// müþteri ekleme
		System.out.println("müþteri eklendi.");
		//DatabaseLogger logger = new DatabaseLogger();// bir kodda baþka bi iþ yapan sýnýf new'leme
		
		logger.log();
	}
}
