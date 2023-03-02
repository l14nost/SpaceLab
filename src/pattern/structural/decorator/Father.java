package pattern.structural.decorator;

public class Father extends FamilyDecorator{
    public Father(Human human) {
        super(human);
    }
    public String work(){
        return " Working";
    }
    @Override
    public String watchTv() {
        return super.watchTv()+work();
    }
}
