package pattern.creational.abstractFactory.HitWave;

import pattern.creational.abstractFactory.Hitter;
import pattern.creational.abstractFactory.Libero;
import pattern.creational.abstractFactory.Setter;
import pattern.creational.abstractFactory.VolleyballTeam;

public class HitWaveTeam implements VolleyballTeam {


    @Override
    public Hitter getHitter() {
        return new Num10();
    }

    @Override
    public Libero getLibero() {
        return new Num6();
    }

    @Override
    public Setter getSetter() {
        return new Num12();
    }
}
