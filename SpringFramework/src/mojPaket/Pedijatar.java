package mojPaket;

public class Pedijatar implements Doktor{
	
	private Oblast oblast;
	private String ime;
	
	@Override
	public void pozdrav() {
		System.out.println("Pozdrav od pedijatra " + this.ime);
		
	}

	@Override
	public void mojaOblastRada() {
		oblast.mojaOblast("decu");
	}

	public Oblast getOblast() {
		return oblast;
	}

	public void setOblast(Oblast oblast) {
		this.oblast = oblast;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void inicijalniMetod() {
		System.out.println("Ucitaj datum...");
		System.out.println("Ucitaj jezike...");
		System.out.println("Otvori konekciju ka necemu...");
	}
	
	public void zavrsniMetod() {
		System.out.println("Raskaci sve konekcije...");
	}
	

}
