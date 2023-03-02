package pattern.behavioral.command;

public class InputCommand implements GeneralStart{
    Program program;

    public InputCommand(Program program) {
        this.program = program;
    }

    @Override
    public void start() {
        program.input();
    }
}
