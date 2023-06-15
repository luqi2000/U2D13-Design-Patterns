package luqmanmohammad.U2D13DesignPatterns.adapter;

import java.util.Calendar;

public class InfoAdapter implements DataSource{

	private Info info;
	
	public InfoAdapter(Info info) {
		super();
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return info.getNome() + "" + info.getCognome();
	}

	@Override
	public int getEta() {
		
		Calendar cal = Calendar.getInstance();// creo un oggetto di tipo Calendar
		cal.setTime(info.getDataDiNascita()); //viene impostatala data di nascita
		int yearOfBirth = cal.get(Calendar.YEAR); //imposto l'anno di nascita
		int currentYear = Calendar.getInstance().get(Calendar.YEAR); // ottengo l'anno corrente
		int age = currentYear - yearOfBirth; //anno corrente meno anno di nascita
		return age;
	}
}
