public class Korisnik extends Osoba{
	private int datumUclanjivanja;
	private int trajanjeClanstva;
	private boolean uzetaKnjiga;
	private boolean duzanKaznu;
	private Knjiga preuzetaKnjiga;
	private Kartica kartica;
	
	public Korisnik(int datumUclanjivanja, int trajanjeClanstva){
		this.datumUclanjivanja = datumUclanjivanja;
		this.trajanjeClanstva = trajanjeClanstva;
		this.uzetaKnjiga = false;
		this.duzanKaznu = false;
		preuzetaKnjiga = null;
		kartica = new Kartica(false, this);
	}
	
	public boolean daLiJeIstekloClanstvo(int trenutniDatum){
		if(trenutniDatum >= datumUclanjivanja + trajanjeClanstva)
			return true;
		return false;
	}
	
	public boolean daLiJeUzeoKnjigu(){
		return uzetaKnjiga;
	}
	
	public boolean daLiMoraPlatitiKaznu(){
		return duzanKaznu;
	}

	public void izdajKnjigu(Knjiga preuzetaKnjiga){
		this.preuzetaKnjiga = preuzetaKnjiga;
		uzetaKnjiga = true;
	}
	
	public void razduziKnjigu(){
		this.preuzetaKnjiga = null;
		uzetaKnjiga = false;
	}
	
	public void obnoviClanarinu(int trenutniDatum){
		datumUclanjivanja = trenutniDatum;
	}
}
