package tp2;

public class Etudiant {

	private long matricule;

	private String nom;
	private String prenom;
	private String spec;

	private char section;

	private int note1;
	private int note2;
	private int note3;

	public void afficher() {

		System.out.println("matricule:" + matricule);
		System.out.println("nom et prenom: " + nom + " " + prenom);
		System.out.println("Specialité :" + spec);
		System.out.println("section :" + section);

	}

	public float moyenne() {

		return (note1 + note2 + note3) / 3;
	}

	void setsec(char section) {

		this.section = section;
	}

	public String Getnom() {

		return nom;
	}

	/*public Etudiant(String nom, String prenom, String spec, char section, int note1, int note2, int note3) {

		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.section = section;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;

	} */
	
	void addnom(String nom) {
		this.nom = nom;
	}
	
	void addprenom(String prenom) {
		this.prenom = prenom;
	}
	void addmatricule(long nom) {
		this.matricule = matricule;
	}
	
	void addnotes(int note1, int note2, int note3) {
		
		this.note1 = note1;
	
		this.note2 = note2;
	
		this.note3 = note3;
	}
	
	void addspec(String spec) {
		this.spec = spec;
	}
	
	
	

}
