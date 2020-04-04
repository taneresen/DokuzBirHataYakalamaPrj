package com.bilisimegitim.hatayakalama;

public class HataOrnek {

	public static void main(String[] args) {
		
		
		
		// düzgün çalışan kod yer alır TRY de

			try {
				int sayi1 = 7;
				int sayi2 = 3;
				
				double sonuc;
				sonuc = sayi1 / sayi2;
				System.out.println("Sonuc: "+sonuc);
				

		// Hata oluşur ise çalışması gereken kodlarıda catch belirler
				
			} catch (Exception e) {
				
				System.err.println("Hata Olustu!"+e.getMessage()); // e.gtmsg hatanin ne oldugunu gosterir.
				//e.printStackTrace(); // Try-Chatch Blogunda Otomatik olarak cikiyor.Kapatalim
									   
			}
			finally 
			{
				System.out.println("Ben her halikarda calışırım");
				
			}
			
	}

}
