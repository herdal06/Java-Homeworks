package interfaces;

public class Utils { // Utilities - Araçlar
	// static : new'lemeye gerek kalmaz. direkt sýnýfýn ismini yazarak metodu çaðýrabiliriz.
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger : loggers)
			logger.log(message);
	}
}
