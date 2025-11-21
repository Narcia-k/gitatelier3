public class ProduitElectronique {
    protected String codeProduit;
    protected String nom;
    protected String marque;
    protected double prix;
    protected int quantite;

    public ProduitElectronique(String codeProduit, String nom, String marque, double prix, int quantite) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Getters
    public String getCodeProduit() { return codeProduit; }
    public String getNom() { return nom; }
    public String getMarque() { return marque; }
    public double getPrix() { return prix; }
    public int getQuantite() { return quantite; }

    // Setters
    public void setCodeProduit(String codeProduit) { this.codeProduit = codeProduit; }
    public void setNom(String nom) { this.nom = nom; }
    public void setMarque(String marque) { this.marque = marque; }
    public void setPrix(double prix) { this.prix = prix; }
    public void setQuantite(int quantite) { this.quantite = quantite; }
}













    }
            }
