import java.util.List;

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomDeCombattant;
    private String poids;
    private List<String> titres;

    public Combattant(String id, String nom, String prenom, String nomDeCombattant, String poids, List<String> titres){
        this.id=id;
        this.nom= nom;
        this.prenom= prenom;
        this.nomDeCombattant=nomDeCombattant;
        this.poids=poids;
        this.titres=titres;
    }
    public Combattant(String id, String nom, String prenom, String nomDeCombattant, String poids){
        this.id=id;
        this.nom= nom;
        this.prenom= prenom;
        this.nomDeCombattant=nomDeCombattant;
        this.poids=poids;
    }
    
    public String getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getNomDeCombattant(){
        return nomDeCombattant;
    }
    public String getPoids(){
        return poids;
    }
    public List<String> getTitres(){
        return titres;
    }

}
