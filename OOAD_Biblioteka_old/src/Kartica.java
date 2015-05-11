public class Kartica {
	private int brojKartice;
	private boolean blokirana;
	private Korisnik vlasnik;
	static int count = 1;
	
	public Kartica(){
		this.blokirana = false;
		this.brojKartice = count;
		this.vlasnik = null;
		count++;
	}
	public Kartica(boolean blokirana, Korisnik vlasnik){
		this.brojKartice = count;
		this.blokirana = blokirana;
		this.vlasnik = vlasnik;
		count++;
	}
	
	public void setBrojKartice(int brojKartice){
		this.brojKartice = brojKartice;
	}
	
	public int getBrojkartice(){
		return brojKartice;
	}
	
	public void setBlokirana(boolean blokirana){
		this.blokirana = blokirana;
	}
	
	public boolean daLiJeBlokirana(){
		return blokirana;
	}
	
	public void setVlasnik(Korisnik vlasnik){
		this.vlasnik = vlasnik;
	}
	
	public Korisnik getVlasnik(){
		return vlasnik;
	}
}
