package collections.Task3;

import java.util.*;

public class Task3 {

    Set<String> carNum = new HashSet<>();
    {
        carNum.add("BH3232OK");
    }
    String car;
    String answer;
    Scanner in = new Scanner(System.in);
    public void setCarNum()  {
        System.out.println("Input carNum:");
        car = in.nextLine();
        carNum.add(car);
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
