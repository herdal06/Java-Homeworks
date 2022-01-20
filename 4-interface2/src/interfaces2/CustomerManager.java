package interfaces2;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) { // 
		this.customerDal = customerDal;
	}
	
	public void add() {
		// iþ kodlarý yazýlýr.
		customerDal.add();
	}
}
