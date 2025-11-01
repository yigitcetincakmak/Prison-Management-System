package cezaevi;

public class Ziyaretci {
    
	private String ad;
    private String soyad;
    private String ziyaretEdilenMahkum;
    private String ziyaretTarihi;

    public Ziyaretci(String ad, String soyad, String ziyaretEdilenMahkum, String ziyaretTarihi) {
       
    	this.ad = ad;
        this.soyad = soyad;
        this.ziyaretEdilenMahkum = ziyaretEdilenMahkum;
        this.ziyaretTarihi = ziyaretTarihi;
    }

    public void bilgiYazdir() {
       
    	System.out.println("Ziyaretçi: " + ad + " " + soyad + "\nZiyaret Edilen: " + ziyaretEdilenMahkum + "\nTarih: " + ziyaretTarihi);
    }

    public String getAd() {
    
    	return ad; 
    }
    
    public String getSoyad() { 
    	
    	return soyad;
    }
    
    public String getZiyaretEdilenMahkum() { 
    	
    	return ziyaretEdilenMahkum;
    }
    
    public String getZiyaretTarihi() { 
    
    	return ziyaretTarihi;
    }

    
    public void setAd(String ad) { 
    	
    	this.ad = ad;
    }
    
    public void setSoyad(String soyad) { 
    	
    	this.soyad = soyad;
    }
    
    public void setZiyaretEdilenMahkum(String ziyaretEdilenMahkum) { 
    	
    	this.ziyaretEdilenMahkum = ziyaretEdilenMahkum;
    }
    
    public void setZiyaretTarihi(String ziyaretTarihi) { 
    	
    	this.ziyaretTarihi = ziyaretTarihi;
    }

    
}













