package tp3;

class Voiture {
	String m;
	double vit;
	
	public Voiture(String m) {
		this.m = m;
		this.vit = 0;
	}
	public void accelerer() {
	    if (vit < 240) {
	        vit += 10; 
	    } else {
	        vit = 240;
	        System.out.println("Vitesse maximale atteinte !");
	    }
	}
	
	public void freiner() {
        if (vit > 0) {
            vit -= 10;
        } else {
            vit = 0;
        }
    }
	
	public void afficher() {
        System.out.println("Marque: " + m + " | Vitesse: " + vit + " km/h");
    }
}
public class ex6 {
	    public static void main(String[] args) {

	        Voiture v1 = new Voiture("BMW");

	        v1.afficher();

	        v1.accelerer();
	        v1.accelerer();
	        v1.afficher();

	        v1.freiner();
	        v1.afficher();
	    }
	}


