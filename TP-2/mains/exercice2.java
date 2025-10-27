package tp2;

public class MainExo2 {
	
	public static void main(String[] args) {

	
		HeureClassExo2  heure = new  HeureClassExo2(15,23,44);
		
		heure.afficherHeure();
		
		heure.addSec(125);
		
		heure.afficherHeure();
		
	}
	
}

