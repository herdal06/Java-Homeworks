package oopIntro;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product(1,"HP 5",15000, "16 GB", 10 ); // referans oluþturma, instance oluþturma
		
		Product product2 = new Product(); // referans oluþturma, instance oluþturma
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar"); 
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Telefon"); 
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		ProductManager productManager = new ProductManager();
		//productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		
	}
}
