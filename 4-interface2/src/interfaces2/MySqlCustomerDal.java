package interfaces2;
// Dal = veritaban� i�lemlerinin yap�ld��� yer
public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("Veritaban�na eklendi : MySQL");
	}

}
