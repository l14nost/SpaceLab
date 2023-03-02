package pattern.creational.abstractFactory;


import pattern.creational.abstractFactory.Irbis.IrbisTeam;

public class VolleyballMatchIrbis {
    public static void main(String[] args) {
        VolleyballTeam volleyballTeam = new IrbisTeam();
        System.out.println("Match:");
        Hitter hitter = volleyballTeam.getHitter();
        Setter setter = volleyballTeam.getSetter();
        Libero libero = volleyballTeam.getLibero();
        hitter.getHit();
        setter.getPass();
        libero.getDefence();
    }


}
