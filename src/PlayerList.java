import java.util.ArrayList;

public class PlayerList {
    ArrayList<Player> list;
    public PlayerList(){
        this.list = new ArrayList<>(); //player not initialize; have to be given to the list
    }
    public void addPlayer(Player p){
        this.list.add(p);
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < this.list.size(); i++){
            int pos = i+1;
            s = s + pos + "-->" + this.list.get(i).toString() + "\n";
        }
        return s;
    }
}

