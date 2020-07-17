package mojPaket;

public class Virusolog implements Doktor {

	private Oblast oblast;
	private String ime;
	
	public Virusolog(Oblast oblast,String ime) {
		this.oblast = oblast;
		this.ime = ime;
	}
	
	@Override
	public void pozdrav() {
		System.out.println("Pozdrav od virusologa " + this.ime);	
	}

	@Override
	public void mojaOblastRada() {
		oblast.mojaOblast("virusa");
	}
	


}
