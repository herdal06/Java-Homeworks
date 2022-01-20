package interfaces2;
// Dal = veritabaný iþlemlerinin yapýldýðý yer
public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("Veritabanýna eklendi : MySQL");
	}

}
