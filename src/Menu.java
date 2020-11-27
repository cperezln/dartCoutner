import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private boolean playing;
    private ArrayList<Team> teams;
    public Menu(){
        this.playing = true;
    }

    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Dart Counter\n" +
                "Juego predefinido: 501\n" +
                "¿Cuántos jugadores van a ser?\n");
        int nPlayer = sc.nextInt();
        System.out.println("Configurando el juego para " + nPlayer + " jugadores...");
        System.out.println("¿En cuántos equipos se va a dividir?");
        int nTeams = sc.nextInt();
        System.out.println("Configure los jugadores por equipo");
        for(int i = 0; i < nTeams; i++){
            int cont = i+1;
            System.out.println("Equipo " + cont);
            this.teams = new ArrayList<>();
            String s = "y";
            ArrayList<Player> players = new ArrayList<>();
            while(s.equals("y")){
                System.out.println("Introduzca los datos del jugador");
                System.out.print("Id/Nombre:    \n");
                String name = sc.next();
                Player p = new Player(name, 0);
                players.add(p);
                System.out.println("¿Quieres continuar? (y/n)");
                s = sc.next();
            }
            System.out.println("Ponga un nombre al equipo");
            String name = sc.next();
            PlayerList pl = new PlayerList();
            pl.setList(players);
            pl.setSize(players.size());
            Team t = new Team(cont, name, pl);
            teams.add(t);
        }
    }
}
