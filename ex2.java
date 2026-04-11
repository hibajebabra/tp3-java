package tp3;

class rectangle {
	double larg;
	double haut;
	
	public rectangle() {
		this.larg = 0;
		this.haut = 0;
	}
	
	public rectangle(double x,double y) {
		this.larg = x;
		this.haut = y;
	}
	
	public double surface() {
		return larg*larg;
	}
	
	public double perimetre() {
		return 2*(larg+larg);
	}
}
public class ex2 {
	public static void main(String[] args) {
		rectangle p = new rectangle(5,9);
		
		System.out.println("la surface de rectangle p   :  "+p.surface());
		System.out.println("la perimetre de rectangle p   :  "+p.perimetre());
	}
}
