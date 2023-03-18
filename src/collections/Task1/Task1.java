package collections.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    List<String> carNum = new ArrayList<>();
    {
        carNum.add("BH3232OK");
    }
    String car;
    String answer;
    Scanner in = new Scanner(System.in);
    boolean check = true;
    public void setCarNum(){
        System.out.println("Input carNum:");
        car = in.nextLine();
        carNum.add(car);


    }
    public void getNum(){

        while (check){
            System.out.println("Menu:" +
                    "\nInput" +
                    "\nList" +
                    "\nStop");

            answer = in.nextLine();
            switch (answer){
                case "List":
                    System.out.println("CarNum:");
                    System.out.println(carNum);
                    break;
                case "Stop":
                    System.out.println("BB");
                    System.exit(0);
                    check = false;
                    break;
                case "Input":
                    setCarNum();
                    break;
                default:
                    System.out.println("Input Stop/List");
                    break;
            }
        }

    }




}
