package pattern.architect.MVP;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    private String login;

    public String getConfirmPassword() {
        return confirmPassword;
    }


    private String confirmPassword;


    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }



    private String password;
    public  void showInfo(){
        System.out.println("Input login");
        login = in.nextLine();
        System.out.println("Input password");
        password = in.nextLine();


    }
    public void regist(){
        System.out.println("Input login:");
        login = in.nextLine();
        System.out.println("Input password:");
        password = in.nextLine();
        System.out.println("Confirm password:");
        confirmPassword = in.nextLine();
    }
}
