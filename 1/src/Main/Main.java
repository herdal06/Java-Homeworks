package Main;

public class Main {
	public static void main(String[] args) {
		//System.out.println("Hello Java");
		
		String[] krediler= {"H�zl� Kredi","Emekli Kredi","�ift�i Kredi","Meb Kredi"};
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		System.out.println("*****");
		// foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		// de�er ve referans tipler
		// values types - stack. int, string, float, double....
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1=sayi2; // sayi1 ve sayi2'nin de�eri ayn�
		sayi2 = 100;
		System.out.println(sayi1);
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1=sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		
		// reference types - heap. array, class, interface....
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {20,30,40,50};
		sayilar1 = sayilar2; // sayi1 ve sayi2'nin g�stedi�i yer ayn�	
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		
	}
}
// 01:39