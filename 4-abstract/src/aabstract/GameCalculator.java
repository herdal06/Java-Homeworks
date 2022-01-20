package aabstract;
// abstract class'ta abstract metod olmak zorunda deðil.
// abstract class'lar new'lenemez.
public abstract class GameCalculator {
	public abstract void hesapla(); // abstract = extend edenler bu metodu kullanmalý. override etmek zorunda
	
	public final void gameOver() { // final = bu metod override edilemez. buradaki gibi kullanýlmalý
		System.out.println("Oyun bitti.");
	}
}
