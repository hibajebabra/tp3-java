package tp3;

class NombreComplexe{
	double r;
	double img;
	
	public NombreComplexe(double r, double img) {
	        this.r = r;
	        this.img = img;
	    }
	public NombreComplexe addition(NombreComplexe n) {
	        double r = this.r + n.r;
	        double i = this.img + n.img;
	        return new NombreComplexe(r, i);
	    }
	public NombreComplexe multiplication(NombreComplexe n) {
	        double r = this.r * n.r - this.img * n.img;
	        double i = this.r * n.img + this.img * n.r;
	        return new NombreComplexe(r, i);
	    }
	public void afficher() {
	        System.out.println(r + " + " + img + "i");
	    }
}
	public class ex4{
	public static void main(String[] args) {
	        NombreComplexe n1 = new NombreComplexe(2, 3); 
	        NombreComplexe n2 = new NombreComplexe(1, 4); 

	        NombreComplexe somme = n1.addition(n2);
	        NombreComplexe produit = n1.multiplication(n2);

	        System.out.print("Somme : ");
	        somme.afficher();

	        System.out.print("Produit : ");
	        produit.afficher();
	    }
	}