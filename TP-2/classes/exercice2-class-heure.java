package tp2;

public class HeureClassExo2 {
	 
	private int  Heure, Minute, Seconde;
	
	
	
	private boolean verif(int Heure, int Minute , int Seconde) {
		 
		 if (Heure >= 23  && Heure < 0 || Minute>=60  && Minute<0 || Seconde >= 60 && Seconde < 0 ){
		 
			return false; 
		 }
			else {
				return true;
			}
			 
	 }
	
	public HeureClassExo2(int Heure,int  Minute,int Seconde) {
		
		if (verif(Heure, Minute , Seconde)){
		
		this.Seconde = Seconde;
		this.Heure = Heure;
		this.Minute = Minute;
		
		
	}
	
		 
}
 
	
	
	void addSec(int sec) {
		
		int intermedH = this.Heure * 3600;
		int intermedM = this.Minute * 60;
		int intermedS = this.Seconde + sec;
		
		intermedS += intermedH + intermedM;
		
		this.Heure = intermedS / 3600;
		if(this.Heure >23) {
			this.Heure %= 24;
		}
		
			this.Minute = intermedS / 60;
			if(this.Minute > 59) {
				this.Minute %= 60;
			}
			
			this.Seconde = intermedS;
			if (this.Seconde > 59) {
				this.Seconde %= 60;
			}
			
			
		
		
		
	}
	
	
public	 void afficherHeure() {
		
		System.out.println(this.Heure+":" + this.Minute + ":" + this.Seconde);
	}
 
}

