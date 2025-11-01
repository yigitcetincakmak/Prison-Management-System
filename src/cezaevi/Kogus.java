package cezaevi;

public class Kogus {
	
    private String kod;
    private int kapasite;
   

    public Kogus(String kod, int kapasite) {
    	
        this.kod = kod;
        this.kapasite = kapasite;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    
    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }


    public void bilgiYazdir() {
        System.out.println("Koğuş: " + kod + ", Kapasite: " + kapasite);	
    }
}

