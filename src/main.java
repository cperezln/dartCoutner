public class main {
    public static void main(String[] args) {
        Player p1 = new Player();
        System.out.println(p1);
        PlayerList pl = new PlayerList();
        Player p2 = new Player("Rodrigo", 23);
        pl.addPlayer(p1);
        pl.addPlayer(p2);
        System.out.println(pl);
        IOFiles fl = new IOFiles("prueba");
        fl.printPlayers(pl);
    }
}