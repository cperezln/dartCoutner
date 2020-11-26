import java.io.*;
public class IOFiles {
    File f;
    String name;
    public IOFiles(String matchId){ //<-- Mirar cómo funcionan los ficheros
        this.name = matchId+".txt";
        this.f = new File(this.name);
    }
    public void printPlayers(PlayerList pl){
        try {
            FileWriter fw = new FileWriter(this.name);
            for (int i = 0; i < pl.getSize(); i++) {
                fw.write(pl.getList().get(i).toString());
            }
        }
        catch(Exception e) {
            System.out.println("There have been an error");
        }
    }
}
