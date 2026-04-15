package tp3;

public class ex7 {
    public static void main(String[] args) {

        GestionProduit gp = new GestionProduit();

        Produit p1 = new Produit(1, "PC", "Ordinateur portable", 8000, 5);
        Produit p2 = new Produit(2, "Souris", "Souris sans fil", 150, 20);

        
        gp.ajouterProd(p1);
        gp.ajouterProd(p2);

        
        System.out.println("Liste des produits :");
        gp.afficherTous();

        
        System.out.println("Modification du produit ID=1");
        gp.modifierProd(1, "PC Gamer", 10000, 3);

       
        System.out.println("Recherche du produit ID=1");
        Produit p = gp.getProduitByID(1);
        if (p != null) {
            p.afficher();
        }

        
        System.out.println("Suppression du produit ID=2");
        gp.supprimerProd(2);

       
        System.out.println("Liste finale :");
        gp.afficherTous();
    }
}
