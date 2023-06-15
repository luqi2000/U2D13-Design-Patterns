package luqmanmohammad.U2D13DesignPatterns.adapter;

import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		 	UserData userData = new UserData();
		 	
	        Info info = new Info();
	        info.setNome("Luqman");
	        info.setCognome("Mohammad");
	        
	        Calendar calendar = Calendar.getInstance();
			calendar.set(2000, Calendar.JANUARY, 07);
			Date dataDiNascita = calendar.getTime();
			info.setDataDiNascita(dataDiNascita);
			
	        //info.setDataDiNascita(new Date(1990, 5, 15)); deprecated

	        DataSource adapter = new InfoAdapter(info);
	        userData.getData(adapter);

	        System.out.println("Nome completo: " + userData.getNomeCompleto());
	        System.out.println("Età: " + userData.getEta());
	}

}
