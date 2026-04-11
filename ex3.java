package tp3;

class etudiant {
	String cne;
	double note;
	
	public etudiant (String a, double n) {
		this.cne = a;
		this.note = n;
		
	}
	public String toString() {
		return "( CNE :"+cne+"LA NOTE :"+note+" )";
	}
	
	public boolean estAdmis() {
		return note >=12 ;
	}
}

public class ex3 {
	public static void main (String[] args) {
		etudiant E = new etudiant("AM8331" , 18);
		
		System.out.println(E.toString());
		System.out.println("est admis "+E.estAdmis());
		
		
	}

}
