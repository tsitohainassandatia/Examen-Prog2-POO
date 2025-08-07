import java.time.LocalDate;

public abstract class Match {
    private int id;
    private LocalDate date;
    private String lieu;
    private TypeMatch typeDeMatch;

    public Match(int id, LocalDate date, String lieu, TypeMatch typeDeMatch){
        this.id=id;
        this.date=date;
        this.lieu=lieu;
        this.typeDeMatch=typeDeMatch;
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
    public TypeMatch getTypeDeMatch(){
        return typeDeMatch;
    }
}
