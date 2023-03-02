package pattern.behavioral.visitor;

public class Builder implements Visitor{
    @Override
    public void visitFoundation(Foundation foundation) {
        System.out.println("Build foundation");
    }

    @Override
    public void visitRoof(Roof roof) {
        System.out.println("Build roof");
    }

    @Override
    public void visitWall(Wall wall) {
        System.out.println("Build wall");
    }
}
