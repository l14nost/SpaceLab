package pattern.behavioral.memento;

import java.util.Scanner;

public class Human {

    public static void main(String[] args) {
        String answer;
        Scanner in = new Scanner(System.in);
        Txt txt = new Txt();
        BackUp backUp = new BackUp();
        System.out.println("Input word:");
        txt.addTxt(in.nextLine());
        System.out.println("Saving");
        backUp.setSave(txt.save());
        System.out.println(txt);
        System.out.println("Input word again:");
        txt.addTxt(in.nextLine());
        System.out.println(txt);
        System.out.println("Do you want to backup?(yes/no)");
        answer = in.nextLine();
        switch (answer){
            case"yes":
                txt.printSave(backUp.getSave());
                break;
            default:
                do{
                    System.out.println("Saving");
                    backUp.setSave(txt.save());
                    System.out.println(txt);
                    System.out.println("Input word again:");
                    txt.addTxt(in.nextLine());
                    System.out.println(txt);
                    System.out.println("Do you want to backup?(yes/no)");
                    answer = in.nextLine();
                }
                while (answer.equals("no"));

        }




    }
}
