import java.time.LocalDate;
import java.util.List;

public abstract class Match {
    private int id;
    private LocalDate date;
    private String lieu;
    private List<TypeMatch> typeDeMatchs;

    public Match(int id, LocalDate date, String lieu, List<TypeMatch> typeDeMatchs){
        this.id=id;
        this.date=date;
        this.lieu=lieu;
        this.typeDeMatchs=typeDeMatchs;
    }

    public int getId(){
        return id;
    }
    public LocalDate getdDate(){
        return date;
    }
    public String lieu(){
        return lieu;
    }
    public String getTypeDeMatch(){
        return typeDeMatchs;
    }
    
}
