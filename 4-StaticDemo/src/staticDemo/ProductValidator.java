package staticDemo;

public class ProductValidator {
	static {
		System.out.println("static yap�c� metod �al��t�");
	}
	public static boolean isValid(Product product) { // bu metodu �a��rabilmek i�in ProductValidator'u new'lemeye gerek yok. static'ler direkt class ismiyle �a�r�labilir. nesne olu�turmaya gerek yok
		if(product.getPrice()>0 && !product.getName().isEmpty())
			return true;
		else
			return false;
	}
}
