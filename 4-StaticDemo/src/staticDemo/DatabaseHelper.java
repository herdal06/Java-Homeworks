package staticDemo;
// Inner class'lar �nerilmez. kullanma. CrudDatabaseHelper ve ConnectionHelper diye 2 class olu�tur.
public class DatabaseHelper {
	public static class Crud {
		public static void Delete() {
			System.out.println("deleted");
		}
		public static void Update() {
			System.out.println("updated");
		}
	}
	public static class Connection {
		public static  void createConnection() {
			System.out.println("veritaban� ba�lant�s� sa�land�.");
		}
	}
}
