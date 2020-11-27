import java.util.ArrayList;

public class Team {
    private int id;
    private String idS;
    private PlayerList pl;

    public Team(int id, String ids, PlayerList pl){
        this.id = id;
        this.idS = ids;
        this.pl = pl;
    }
    //Getters
    public int getId() {
        return id;
    }

    public PlayerList getPl() {
        return pl;
    }

    public String getIdS() {
        return idS;
    }
    //-----------------
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }

    public void setPl(PlayerList pl) {
        this.pl = pl;
    }
    //-----------------
}
