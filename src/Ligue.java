import java.util.List;

public class Ligue {
    private String nom;
    private List<Combattant> combattants;
    private List<Match> matchs;

    public Ligue(String nom, List<Combattant> combattants, List<Match> matchs){
        this.nom=nom;
        this.combattants=combattants;
        this.matchs=matchs;
    }

    public String getNom(){
        return nom;
    }
    public List<Combattant> geCombattants(){
        return combattants;
    }
    public List<Match> geMatchs(){
        return matchs;
    }
}
