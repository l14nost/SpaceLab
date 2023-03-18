package collections.Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    List<String> carNum = new LinkedList<>();
    {
        carNum.add("BH3232OK");
    }
    String car;
    String answer;
    int index;
    Scanner in = new Scanner(System.in);
    Scanner in1 = new Scanner(System.in);
    public void setCarNum()  {
        System.out.println("Input carNum:");
        car = in.nextLine();
        System.out.println("Input index:");
        index = in1.nextInt();
        if(index-1>carNum.size()){
            carNum.add(carNum.size(),car);
        }
        else {
            carNum.add(index-1,car);
        }
        System.out.println("Car add");
    }
    public void getNum() {


       while (true){
            System.out.println("Menu:" +
                    "\n-Input" +
                    "\n-List" +
                    "\n-Stop" +
                    "\nChoose:");
            answer = in.nextLine();
            switch (answer){
                case "Input":
                    setCarNum();
                    break;
                case "List":
                    System.out.println("CarNum:");
                    System.out.println(carNum);
                    break;
                case "Stop":
                    System.out.println("BB");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input:Input/Stop/List");
                    break;
            }
        }

    }
}
