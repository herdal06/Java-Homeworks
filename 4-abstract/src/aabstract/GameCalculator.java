package aabstract;
// abstract class'ta abstract metod olmak zorunda de�il.
// abstract class'lar new'lenemez.
public abstract class GameCalculator {
	public abstract void hesapla(); // abstract = extend edenler bu metodu kullanmal�. override etmek zorunda
	
	public final void gameOver() { // final = bu metod override edilemez. buradaki gibi kullan�lmal�
		System.out.println("Oyun bitti.");
	}
}
