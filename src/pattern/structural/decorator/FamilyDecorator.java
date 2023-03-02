package pattern.structural.decorator;

public class FamilyDecorator implements Human{
    Human human;
    public FamilyDecorator(Human human) {
        this.human = human;
    }


    @Override
    public String watchTv() {
        return human.watchTv();
    }
}
