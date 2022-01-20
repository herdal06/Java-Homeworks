package interfaces;

public class Utils { // Utilities - Ara�lar
	// static : new'lemeye gerek kalmaz. direkt s�n�f�n ismini yazarak metodu �a��rabiliriz.
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger : loggers)
			logger.log(message);
	}
}
