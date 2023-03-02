package pattern.behavioral.visitor;

public interface Visitor {
    void visitFoundation(Foundation foundation);
    void visitRoof(Roof roof);
    void visitWall(Wall wall);
}
