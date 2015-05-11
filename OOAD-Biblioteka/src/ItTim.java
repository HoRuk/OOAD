import java.util.*;

public class ItTim {
	private int plata;
	private ArrayList<String> zahtjevi;
	private ArrayList<Uposlenik> clanovi;
	
	public void registrujZahtjev(String zahtjev){
		zahtjevi.add(zahtjev);
	}
	
	public void setPlata(int plata){
		this.plata = plata;
	}
	
	public int getPlata(){
		return this.plata;
	}
	
	public String getZahtjev(int j){
		return zahtjevi.get(j);
	}
}
