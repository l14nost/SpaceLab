package pattern.behavioral.visitor;

public class Roof implements Construction{
    @Override
    public void success(Visitor visitor) {
        visitor.visitRoof(this);
    }
}
