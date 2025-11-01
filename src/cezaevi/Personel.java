package cezaevi;

public class Personel {
	
    private String ad;
    private String soyad;
    private String gorev;
    private int yas;

    public Personel(String ad,String soyad ,String gorev, int yas) {
    
    	this.ad = ad;
    	this.soyad = soyad;
        this.gorev = gorev;
        this.yas = yas;
    
    }

    public String getAd() {
    
    	return ad;
    
    }

    public void setAd(String ad) {
       
    	this.ad = ad;
    
    }
    
    public String getSoyad() {
        
    	return soyad;
    
    }
    
    public void setSoyad(String soyad) {
        
    	this.soyad = soyad;
    
    }
        

    public String getGorev() {
     
    	return gorev;
    
    }

    public void setGorev(String gorev) {
    
    	this.gorev = gorev;
    
    }

    public int getYas() {
    
    	return yas;
    
    }

    public void setYas(int yas) {
    
    	this.yas = yas;
    
    }

    public void bilgiYazdir() {
    	
        System.out.println("Personel: " + ad +" " +soyad + "\nGörev: " + gorev + "\nYaş: " + yas);
    
    }
}


















