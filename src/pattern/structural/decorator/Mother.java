package pattern.structural.decorator;

public class Mother extends FamilyDecorator{
    public Mother(Human human) {
        super(human);
    }


    public String clean(){
        return " Cleaning";
    }
    @Override
    public String watchTv() {
        return super.watchTv() +clean();
    }
}
