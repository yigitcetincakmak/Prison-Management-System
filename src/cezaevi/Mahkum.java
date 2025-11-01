package cezaevi;


public abstract class Mahkum {       
	
	protected String ad; 
    protected String soyad; 
    protected String suclulukDurumu; 
    protected String sucturu;
    protected String kogus;
    protected int yas;

    public Mahkum(String ad, String soyad, int yas, String kogus, String suclulukDurumu, String sucturu) {
        
    	this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.kogus = kogus;
        this.suclulukDurumu = suclulukDurumu;
        this.sucturu = sucturu;
        
    }

    
    
    
    public abstract void bilgiYazdir();

    
    
    
    public String getAd() { 
    	
    	return ad;
    }
    
    public String getSoyad() {
    	
    	return soyad;
    }
    
    public int getYas() {
    	
    	return yas;
    }
    
    public String getKogus() { 
    	
    	return kogus;
    }
    
    public String getSuclulukDurumu() { 
    	
    	return suclulukDurumu;
    }
    
    public String getSucturu() {
    	
    	return sucturu;
    }

    
    public void setAd(String ad) {
    	
    	this.ad = ad;
    }
    
    public void setSoyad(String soyad) {
    	
    	this.soyad = soyad;
    }
    
    public void setYas(int yas) {
    	
    	this.yas = yas;
    }
    
    public void setKogus(String kogus) {
    	
    	this.kogus = kogus;
    }
    
    public void setSuclulukDurumu(String suclulukDurumu) {
    	
    	this.suclulukDurumu = suclulukDurumu;
    }
    
    public void setSucturu(String sucturu) { 
    	
    	this.sucturu = sucturu;
    }
    
}
