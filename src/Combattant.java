import java.util.List;

public class Combattant {
    private String identifiant;
    private String nom;
    private String prenom;
    private String nomDeCombattant;
    private String poids;
    private List<String> titres;

    public Combattant(String identifiant, String nom, String prenom, String nomDeCombattant, String poids, List<String> titres){
        this.identifiant=identifiant;
        this.nom= nom;
        this.prenom= prenom;
        this.nomDeCombattant=nomDeCombattant;
        this.poids=poids;
    }

    public String getIdentifiant(){
        return identifiant;
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
