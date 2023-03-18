package collections.Task4;

import java.util.*;

public class Task4 {
    Map<String,String> carNum = new HashMap<>();
    {
        carNum.put("BH3232OK","Oleg");
        carNum.put("BH33333K","Oleg");
        carNum.put("BH4444OK","Andrey");
        carNum.put("BH5555OK","Max");
        carNum.put("BH6666OK","Amir");
    }
    String car;
    String owner;
    String answer;
    Scanner in = new Scanner(System.in);
    public void setCarNum()  {
        System.out.println("Input carNum:");
        car = in.nextLine();
        System.out.println("Input owner:");
        owner = in.nextLine();
        carNum.put(car,owner);
        System.out.println("Car add");
    }
    public void getNum() {


        while (true){
            System.out.println("Menu:" +
                    "\n-Input" +
                    "\n-List" +
                    "\n-Stop" +
                    "\n-Car" +
                    "\n-Owner" +
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
                case "Car":
                    System.out.println("Car");
                    System.out.println(carNum.keySet());
                    break;
                case "Owner":
                    System.out.println("Owner");
                    System.out.println(carNum.values());
                    break;
                default:
                    System.out.println("Input:Input/Stop/List");
                    break;
            }
        }

    }
}

