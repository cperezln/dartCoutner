import java.util.ArrayList;

public class Game {
    private int[] points;
    private ArrayList<Team> teamList;

    public Game(int nTeams){
        this.points = new int[nTeams];
        for(int i = 0; i<nTeams; i++){
            this.points[i] = 501;
        }
        this.teamList = new ArrayList<>();
    }
    //Getters
    public int[] getPoints() {
        return points;
    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }
    //---------------
    //Setters
    public void setPoints(int points[]) {
        this.points = points;
    }

    public void setTeamList(ArrayList<Team> teamList) {
        this.teamList = teamList;
    }
    //----------------
    public void score(int team, int mult, int point){
        this.points[team-1]-=(mult*point);
    }
}
