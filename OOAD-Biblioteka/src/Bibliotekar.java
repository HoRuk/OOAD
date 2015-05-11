import java.util.*;

public class Bibliotekar {
	private int plata;
	
	public void setPlata(int plata){
		this.plata = plata;
	}
	
	public int getPlata(){
		return this.plata;
	}
	
	public void uclaniKorisnika(Korisnik korisnik){
		
	}
	
	public boolean izdajKnjigu(Korisnik korisnik, Knjiga knjiga){
		return true;
	}
	
	public PotrebneKnjige DodajNovuKnjiguUListuZelja(Knjiga knjiga){
		PotrebneKnjige pok = new PotrebneKnjige();
		return pok;
	}
	
	public void ObavijestiSekretaraONabavci(){
		
	}
	
	public void PreuzmiKnjigeOdDobavljaca(Dostavljac dos, ArrayList<Knjiga> knjige){
		
	}
	public void dozvoliPristupCitaoni(Korisnik korisnik){
		
	}
	public void ProduziClanarinu(Korisnik korisnik){
		
	}
	public void BlokirajKorisnika(Korisnik korisnik){
		
	}
	public void predajZahtjevItTimu(String zahtjev, ItTim ittim){
		
	}
}
