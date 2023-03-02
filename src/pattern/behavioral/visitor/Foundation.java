package pattern.behavioral.visitor;

public class Foundation implements Construction{
    @Override
    public void success(Visitor visitor) {
        visitor.visitFoundation(this);
    }
}
