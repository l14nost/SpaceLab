package pattern.behavioral.command;

public class DeleteCommand implements GeneralStart{
    Program program;

    public DeleteCommand(Program program) {
        this.program = program;
    }

    @Override
    public void start() {
        program.delete();
    }
}
