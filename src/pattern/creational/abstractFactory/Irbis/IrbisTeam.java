package pattern.creational.abstractFactory.Irbis;

import pattern.creational.abstractFactory.Hitter;
import pattern.creational.abstractFactory.Libero;
import pattern.creational.abstractFactory.Setter;
import pattern.creational.abstractFactory.VolleyballTeam;

public class IrbisTeam implements VolleyballTeam {


    @Override
    public Hitter getHitter() {
        return new Num9();
    }

    @Override
    public Libero getLibero() {
        return new Num5();
    }

    @Override
    public Setter getSetter() {
        return new Num11();
    }
}
