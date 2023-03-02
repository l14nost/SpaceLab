package pattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {


    public static void main(String[] args) {
        int countV=0;
        int countB=0;
        int countF=0;
        Scanner in = new Scanner(System.in);
        Children children = new Children(null);
        List<Children> childrenList = new ArrayList<>();
        do{
            System.out.println("Choose ball(v/b/f):");
            childrenList.add(new Children(in.nextLine()));
        }
        while (childrenList.size()<10);
        for(int i = 0; i<childrenList.size();i++){
            if(childrenList.get(i).nameBall.equals("v")){
                countV++;
            }
            else if(childrenList.get(i).nameBall.equals("b")){
                countB++;
            }
            else{
                countF++;
            }
        }
        if(countF>countB&&countF>countV){
            children.setBall(new Football());
            children.doSport();
        } else if (countV>countB&&countV>countF) {
            children.setBall(new Volleyball());
            children.doSport();
        }
        else {
            children.setBall(new Basketball());
            children.doSport();
        }
    }
}
