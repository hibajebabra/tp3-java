package tp3;
class CompteBan{
	String n;
	double s;
	
	public CompteBan(String n,double s) {
		this.n = n;
		this.s = s;
	}
	public void  deposer(double m) {
		 s += m;
	}
	public void retirer(double m) {
		if (m < s) {
			s -=m;
		}else {
			System.out.println("solde insuffisant");
		}
	}
	public void transferer(CompteBan autre,double m) {
		if(m < s) {
			this.s -= m;
			autre.s +=m;
		}else 
			System.out.println("transfert impossible");
	}
	public void afficherSolde() {
	    System.out.println("Solde du compte " + n + " : " + s);
	}
}
public class ex5 {
    public static void main(String[] args) {
        CompteBan c1 = new CompteBan("A1", 1000);
        CompteBan c2 = new CompteBan("B2", 500);

        c1.deposer(200);
        c1.retirer(100);
        c1.transferer(c2, 300);

        c1.afficherSolde();
        c2.afficherSolde();
    }
}

