package interfaces2;

public class OracleCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("Veritaban�na eklendi : Oracle");
	}

}
