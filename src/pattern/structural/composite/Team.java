package pattern.structural.composite;

import java.util.ArrayList;

public class Team {
    ArrayList<Players> team = new ArrayList<>();

    public void addPlayer(Players players){
        team.add(players);
    }
    public void startMatch(){
        for (Players players: team){
            players.task();
        }
    }
}
