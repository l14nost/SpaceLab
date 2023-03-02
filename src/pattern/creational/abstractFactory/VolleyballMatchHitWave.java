package pattern.creational.abstractFactory;

import pattern.creational.abstractFactory.HitWave.HitWaveTeam;

public class VolleyballMatchHitWave {
    public static void main(String[] args) {
        VolleyballTeam volleyballTeam = new HitWaveTeam();
        System.out.println("Match:");
        Hitter hitter = volleyballTeam.getHitter();
        Setter setter = volleyballTeam.getSetter();
        Libero libero = volleyballTeam.getLibero();
        hitter.getHit();
        setter.getPass();
        libero.getDefence();
    }
}
