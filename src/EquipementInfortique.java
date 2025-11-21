
public class EquipementInfortique
        extends ProduitElectronique{
    private String proccesseur;
    private int ram;
    private int stokage;
    private String systemeExploitation;
    private boolean wifi;
    public
    EquipemmentInfortique(String codeProduit,String nom, String marque,double prix,int quantite,String processeur,int ram,int stockage,String systemeEploitation,boolean wifi) {
        super(codeProduit, nom, marque, prix, quantite);
        this.proccesseur = processeur;
        this.ram = ram;
        this.stockage = stockage;
        this.systemeExploitation = systemeEploitation;
        this.wifi = wifi;
    }
    // Getters et setters...
}







