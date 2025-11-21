public class Electromenager public class ProduitElectronique {
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


Sous-classe : Electromenager

        java
public class Electromenager extends ProduitElectronique {
    private int puissance;
    private String type;
    private boolean garantie;
    private String couleur;
    private String tension;

    public Electromenager(String codeProduit, String nom, String marque, double prix, int quantite,
                          int puissance, String type, boolean garantie, String couleur, String tension) {
        super(codeProduit, nom, marque, prix, quantite);
        this.puissance = puissance;
        this.type = type;
        this.guarantee = garantie;
        this.couleur = couleur;
        this.tension = tension;
    }

    // Getters et Setters...
}







java
public class EquipementInformatique extends ProduitElectronique {
    private String processeur;
    private int ram;
    private int stockage;
    private String systemeExploitation;
    private boolean wifi;

    public EquipementInformatique(String codeProduit, String nom, String marque, double prix, int quantite,
                                  String processeur, int ram, int stockage, String systemeExploitation, boolean wifi) {
        super(codeProduit, nom, marque, prix, quantite);
        this.processeur = processeur;
        this.ram = ram;
        this.stockage = stockage;
        this.systemeExploitation = systemeExploitation;
        this.wifi = wifi;
    }

    // Getters et Setters...
}





{
        }

