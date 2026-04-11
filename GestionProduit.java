package tp3;

import java.util.ArrayList;

public class GestionProduit {

    private ArrayList<Produit> listeProduits = new ArrayList<>();

    
    public void ajouterProd(Produit p) {
        listeProduits.add(p);
        System.out.println("Produit ajouté !");
    }

    
    public void modifierProd(int id, String nom, double prix, int quantite) {
        for (Produit p : listeProduits) {
            if (p.getId() == id) {
                p.setNom(nom);
                p.setPrix(prix);
                p.setQuantite(quantite);
                System.out.println("Produit modifié !");
                return;
            }
        }
        System.out.println("Produit introuvable !");
    }

    
    public void supprimerProd(int id) {
        for (Produit p : listeProduits) {
            if (p.getId() == id) {
                listeProduits.remove(p);
                System.out.println("Produit supprimé !");
                return;
            }
        }
        System.out.println("Produit introuvable !");
    }

    
    public Produit getProduitByID(int id) {
        for (Produit p : listeProduits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    
    public void afficherTous() {
        for (Produit p : listeProduits) {
            p.afficher();
        }
    }
}