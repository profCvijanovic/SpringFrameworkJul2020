package mojPaket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Virusolog implements Doktor {

	private Oblast oblast;
	private String ime;
	
	@Autowired
	public Virusolog(Oblast oblast) {
		this.oblast = oblast;
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
