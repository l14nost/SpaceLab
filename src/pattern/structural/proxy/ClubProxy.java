package pattern.structural.proxy;

import java.util.Scanner;

public class ClubProxy implements Club{
    Scanner in = new Scanner(System.in);

    Human human = new Human();

    @Override
    public void dance() {
        if(check() == true){
            human.dance();
        }
        else{
            System.out.println("Go to school");
        }

    }
    public boolean check(){
        System.out.println("Input your age:");
        human.setAge(in.nextInt());
        if (human.getAge()>=18){
            return true;
        }
        else {
            return false;
        }
    }
}
