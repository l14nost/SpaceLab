package pattern.behavioral.command;

public class Admin {
    GeneralStart delete;
    GeneralStart input;

    public Admin(GeneralStart delete, GeneralStart input) {
        this.delete = delete;
        this.input = input;
    }
    public void deleteTxt(){
        delete.start();
    }
    public void inputTxt(){
        input.start();
    }
}
