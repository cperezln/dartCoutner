import java.util.ArrayList;

public class PlayerList {
    private ArrayList<Player> list;
    private int size;
    public PlayerList(){
        this.list = new ArrayList<>(); //player not initialize; have to be given to the list
        this.size = 0;
    }

    public void addPlayer(Player p){
        this.list.add(p);
        this.size++;
    }

    public ArrayList<Player> getList(){
        return this.list;
    }

    public int getSize() {
        return size;
    }

    public void setList(ArrayList<Player> list) {
        this.list = list;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < this.size; i++){
            int pos = i+1;
            s = s + pos + "-->" + this.list.get(i).toString() + "\n";
        }
        return s;
    }
}

