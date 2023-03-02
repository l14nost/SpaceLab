package pattern.behavioral.visitor;

public class Wall implements Construction{
    @Override
    public void success(Visitor visitor) {
        visitor.visitWall(this);
    }
}
