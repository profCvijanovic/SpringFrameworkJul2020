package mojPaket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hirurg implements Doktor {
	
	@Autowired
	private Oblast oblast;
	
	@Override
	public void pozdrav() {
		System.out.println("Pozz od hirurga!");
		
	}

	@Override
	public void mojaOblastRada() {
		oblast.mojaOblast("skalpelom");
	}

}
