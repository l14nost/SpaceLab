package pattern.behavioral.command;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    ArrayList<String> arr = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public void input(){
        System.out.println("Input txt:");
        arr.add(in.next());
    }
    public void delete(){
        System.out.println(arr);
        arr.removeAll(arr);
        System.out.println("Delete successful");
        System.out.println(arr);
    }
}
