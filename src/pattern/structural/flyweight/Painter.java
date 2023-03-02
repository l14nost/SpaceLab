package pattern.structural.flyweight;

public class Painter implements Master{
    @Override
    public void build() {
        System.out.println("I work with a paint brush");
    }
}
