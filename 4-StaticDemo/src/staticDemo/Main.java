package staticDemo;

public class Main {
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.Delete();
		
	}
}
