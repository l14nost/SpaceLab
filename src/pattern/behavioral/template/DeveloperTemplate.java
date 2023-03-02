package pattern.behavioral.template;

public abstract class  DeveloperTemplate {
    public void showInfo(){
        System.out.println("Backend Developer");
        addLanguage();
        System.out.println("Company:Google");
    }
    abstract void addLanguage();
}
