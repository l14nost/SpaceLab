package pattern.structural.composite;

public class Match {
    public static void main(String[] args) {
        Team team = new Team();
        Hitter hitter = new Hitter();
        Setter setter = new Setter();
        Libero libero = new Libero();
        team.addPlayer(hitter);
        team.addPlayer(setter);
        team.addPlayer(libero);
        System.out.println("Match start");
        team.startMatch();
    }
}
