package algorithm.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public void task(){
        int length;
        int num;
        int step = 0;
        boolean check = false;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Length:");
        length = in.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i<arr.length;i++){
            arr[i] = random.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Input num:");
        num = in.nextInt();
        for(int i = 0; i<arr.length;i++){
            step++;
            if(num == arr[i]){
                System.out.println("Num at this index:"+i);
                System.out.println("Count of step:"+step);
                check = true;
            }
            else if(i == arr.length-1 && check == false){
                System.out.println("This num isn't in the array");
            }


        }

    }
}
