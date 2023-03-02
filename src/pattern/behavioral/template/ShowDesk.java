package pattern.behavioral.template;

public class ShowDesk {
    public static void main(String[] args) {
        DeveloperTemplate javaDev = new JavaDev();
        DeveloperTemplate phpDev = new PhpDev();
        javaDev.showInfo();
        System.out.println("");
        phpDev.showInfo();
    }


}
