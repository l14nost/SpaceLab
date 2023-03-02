package pattern.structural.adapter;

public class Nozzle implements Mixer{
    Egg egg = new Egg();
    @Override
    public void whip() {
        this.egg.breakEgg();
        this.egg.ready();
    }
}
