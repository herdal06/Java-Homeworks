package staticDemo;

public class ProductValidator {
	static {
		System.out.println("static yapýcý metod çalýþtý");
	}
	public static boolean isValid(Product product) { // bu metodu çaðýrabilmek için ProductValidator'u new'lemeye gerek yok. static'ler direkt class ismiyle çaðrýlabilir. nesne oluþturmaya gerek yok
		if(product.getPrice()>0 && !product.getName().isEmpty())
			return true;
		else
			return false;
	}
}
