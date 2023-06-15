package luqmanmohammad.U2D13DesignPatterns.adapter;

public class UserData {
	 private String nomeCompleto; 
	 private int eta; 
	 
	 public void getData(DataSource ds) { 
	 nomeCompleto = ds.getNomeCompleto (); 
	 eta = ds.getEta(); 
	 } 
	 
	 public String getNomeCompleto() {
			return nomeCompleto;
	}

		public int getEta() {
			return eta;
	}
}
