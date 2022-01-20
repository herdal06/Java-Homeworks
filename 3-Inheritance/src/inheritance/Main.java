package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer taha = new IndividualCustomer();
		taha.setCustomerNumber("12345");
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setCustomerNumber("78910");
		SendikaCustomer abc =new SendikaCustomer();
		abc.setCustomerNumber("99999");
		
		CustomerManager customerManager = new CustomerManager();
		/*customerManager.add(taha);
		customerManager.add(hepsiBurada);
		customerManager.add(abc);*/
		
		Customer[] customers = {taha,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);
	}
}
