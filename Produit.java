package tp3;

public class Produit {
    private int id;
    private String nom;
    private String description;
    private double prix;
    private int quantite;


    public Produit(int id, String nom, String description, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getDescription() { return description; }
    public double getPrix() { return prix; }
    public int getQuantite() { return quantite; }

    
    public void setNom(String nom) { this.nom = nom; }
    public void setDescription(String description) { this.description = description; }
    public void setPrix(double prix) { this.prix = prix; }
    public void setQuantite(int quantite) { this.quantite = quantite; }

  
    public void afficher() {
        System.out.println("ID: " + id + " | Nom: " + nom +
                " | Prix: " + prix + " | Quantité: " + quantite);
    }
}
