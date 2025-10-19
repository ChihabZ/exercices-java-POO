package tp2;

public class MainExo1 {

	public static void main(String[] args) {
		
		
		
		 Etudiant E1 = new  Etudiant();
		 Etudiant E2 = new  Etudiant();
		 
		 // les valeurs des attributs de E1 sont nulles.
		 //
		
		E1.addmatricule(512555);
		E1.addnom("Azi");
		E1.addprenom("Amine");
		E1.addspec("ISIL");
		E1.setsec('A');
		E1.addnotes(12, 13, 6);
		
		
		
		E2.addmatricule(512004);
		E2.addnom("Ziane");
		E2.addprenom("Maroua");
		E2.addspec("ISIL");
		E2.setsec('B');
		E2.addnotes(14, 15, 7);
		
		
		
		E1.afficher();
		E2.afficher();
		
		
	}
	
	
		
	}
	

