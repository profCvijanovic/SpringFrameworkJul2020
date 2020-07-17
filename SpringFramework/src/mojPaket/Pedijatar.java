package mojPaket;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pedijatar implements Doktor{
	
	private Oblast oblast;
	@Value("${pedijatar.ime}")
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
	
	@Autowired
	public void setOblast(Oblast oblast) {
		this.oblast = oblast;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	@PostConstruct
	public void inicijalniMetod() {
		System.out.println("Ucitaj datum...");
		System.out.println("Ucitaj jezike...");
		System.out.println("Otvori konekciju ka necemu...");
	}
	
	@PreDestroy
	public void zavrsniMetod() {
		System.out.println("Raskaci sve konekcije...");
	}
	

}
