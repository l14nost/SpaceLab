package pattern.structural.flyweight;

public class Builder implements Master{
    @Override
    public void build() {
        System.out.println("I work with a hammer");
    }
}
