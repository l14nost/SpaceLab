package pattern.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        Admin admin = new Admin(new DeleteCommand(program),new InputCommand(program));
        admin.inputTxt();
        admin.deleteTxt();
    }

}
