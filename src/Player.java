public class Player {
    private String id;
    private int punt;
    public Player(String id, int p) {
        this.id = id;
        this.punt = p;
    }
    public Player(){
        this("Default", 0);
    }
    public void setPunt(int newPunt){
        this.punt = newPunt;
    }
    public int getPunt() {
        return punt;
    }
    public void increasePunt(int inc){
        this.setPunt(this.punt+inc);
    }
    @Override
    public String toString(){
        return "Player " + this.id + " with nº of points " + this.punt;
    }
}
