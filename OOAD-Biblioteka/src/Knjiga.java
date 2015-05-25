public class Knjiga {
	private String nazivKnjige;
	private String imeAutora;
	private int barKod;
	private boolean zauzece;
	private Korisnik trenutniVlasnik;

	public void zaduzi(Korisnik vlasnik){
		this.trenutniVlasnik = vlasnik;
		zauzece = true;
	}
	
	public void razduzi(){
		zauzece = false;
		trenutniVlasnik = null;
	}
	
	public boolean daLiJeUzeta(){
		return zauzece;
	}
	
	public void setBarKod(int barKod){
		this.barKod = barKod;
	}
	
	public int getBarKod(){
		return barKod;
	}
	
	public void setImeAutora(String imeAutora){
		this.imeAutora = imeAutora;
	}
	
	public String getImeAutora(String imeAutora){
		return imeAutora;
	}
	
	public void setNazivKnjige(String nazivKnjige){
		this.nazivKnjige = nazivKnjige;
	}
	
	public String getNazivKnjige(String nazivKnjige){
		return nazivKnjige;
	}
	
}
