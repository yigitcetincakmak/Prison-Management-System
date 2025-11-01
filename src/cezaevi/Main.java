package cezaevi;

public class Main {

	public static void main(String[] args) {
		
		   // Mahkum m = new Mahkum("Ahmet", "Yılmaz", 35, "A1", "Ağır Suçlu", "Cinayet");
	        Ziyaretci z = new Ziyaretci("Zeynep", "Kaya", "Ali", "2025-05-10");
	        Personel p = new Personel("Zeynep", "Demir", "Gardiyan", 28);

	        //bilgiYazdir
	        z.bilgiYazdir();
	        System.out.println("----------------------");
	        p.bilgiYazdir();
	        
	        /*
	         
	             Mahkum soyut (abstract) bir sınıf olduğu için doğrudan bir nesne oluşturamayız, 
         		 Mahkum sınıfı ortak davranışları ve özellikleri tanımlayan bir sınıf olduğu için 
         		 alt sınıflar oluşturup kalıtım alıcaz ve  bu sınıflardan nesne oluşturacağız  
         
         
         */
	
	}

}
