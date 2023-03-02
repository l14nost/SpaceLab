package pattern.creational.abstractFactory.HitWave;

import pattern.creational.abstractFactory.Hitter;

public class Num10 implements Hitter {
    @Override
    public void getHit() {
        System.out.println("I'm hit, my num 10");
    }
}
