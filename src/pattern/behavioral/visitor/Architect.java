package pattern.behavioral.visitor;

public class Architect implements Visitor{
    @Override
    public void visitFoundation(Foundation foundation) {
        System.out.println("Architect foundation");
    }

    @Override
    public void visitRoof(Roof roof) {
        System.out.println("Architect roof");
    }

    @Override
    public void visitWall(Wall wall) {
        System.out.println("Architect wall");
    }
}
