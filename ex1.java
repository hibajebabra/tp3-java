package tp3;

class point {

		double x;
		double y;
		
		public point() {
			this.x= 0;
			this.y= 0;
		}
		
		public point(double x,double y) {
			this.x = x;
			this.y = y;
		}
		
		public void afficher() {
			System.out.println("le point("+x+","+y+")");
		}
		
		public void deplacer(double a,double b) {
			this.x += a;
			this.y += b;
		}
		
		public double distanceOrigine() {
			return Math.sqrt(x * x +y * y);
		}
		public double distanceEntrePoints(point p) {
			double dx = p.x -this.x;
			double dy = p.y -this.y;
			return Math.sqrt(dx * dx + dy * dy);
		}
		
		
}
public class ex1{
	public static void main(String[] args) {
		point p1 = new point();
		point p2 = new point(4,5);
		
		p1.afficher();
		p2.afficher();
		
		p2.deplacer(3, 4);
		
		System.out.println("distance origine  "+p2.distanceOrigine());
		System.out.println("distance origine  "+p1.distanceEntrePoints(p2));
		
		
	}
}
 
