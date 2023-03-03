package pattern.architect.MVP;

import java.util.Scanner;

public class Presenter {
    UserData userData = new UserData();
    View view = new View();
    public String answer;
    Scanner in = new Scanner(System.in);
    public boolean check = false;

    public void check(){
        view.showInfo();
        for (int i = 0;i<userData.getUser().size();i++){
            if(view.getLogin().equals(userData.getUser().get(i).login)&& view.getPassword().equals(userData.getUser().get(i).password)){
                System.out.println("Welcome");
                check = true;
            }
        }
        if(check == false){
            System.out.println("Incorrect do you want to regist?");
            answer = in.nextLine();
            switch (answer){
                case "y":
                    view.regist();
                    if(view.getPassword().equals(view.getConfirmPassword())){
                        userData.setUser(new User(view.getLogin(), view.getPassword()));
                        System.out.println();
                        break;
                    }
                    else {
                        System.out.println("try again");
                        view.regist();
                        break;
                    }
                case "n":
                    System.out.println("bb");
                    break;


            }
        }


    }
}
