package pattern.behavioral.cof;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int x,y;
        Task first = new FirstCheck();
        Task second = new SecondCheck();
        Task third = new ThirdCheck();
        Scanner in = new Scanner(System.in);
        first.setNextMessage(second);
        second.setNextMessage(third);
        System.out.println(Task.task);
        System.out.println("Input x:");
        x = in.nextInt();
        System.out.println("Input y:");
        y = in.nextInt();
        first.clientMessage(x,y);
    }
}
