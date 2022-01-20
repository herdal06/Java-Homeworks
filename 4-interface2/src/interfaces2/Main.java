package interfaces2;

public class Main {
	public static void main(String[] args) {
		CustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		//customerManager.customerDal = new MySqlCustomerDal();
		customerManager.add();
	}
}
