package interfaces2;
// Dal = veritabanı işlemlerinin yapıldığı yer
public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("Veritabanına eklendi : MySQL");
	}

}
