package inheritance;

public class CustomerManager {
	public void  add(Logger logger) {
		// m��teri ekleme
		System.out.println("m��teri eklendi.");
		//DatabaseLogger logger = new DatabaseLogger();// bir kodda ba�ka bi i� yapan s�n�f new'leme
		
		logger.log();
	}
}
