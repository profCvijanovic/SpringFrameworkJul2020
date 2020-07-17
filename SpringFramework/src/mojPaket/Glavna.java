package mojPaket;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Glavna {

	public static void main(String[] args) {
		
		// ovo je fabrika
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springFajl.xml");
		
		Doktor doktor = context.getBean("pedijatar",Doktor.class);
		
		doktor.pozdrav();
		doktor.mojaOblastRada();
		
		context.close();
	

	}

}
