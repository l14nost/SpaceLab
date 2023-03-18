package collections.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Alist {
    long start,stop;



    List<Integer> array = new ArrayList<>();
    public void addNew(){
        start = System.nanoTime();
        for(int i = 0; i<1001; i++){
            int a = (int) (Math.random()*(600+1)) - 200;
            array.add(a);
        }
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void getArr(){
        System.out.println(array);

    }
    public void last(){
        start = System.nanoTime();

        array.add(0);
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void middle(){
        start = System.nanoTime();
        array.add(450,10000);
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void getLast(){
        start = System.nanoTime();
        System.out.println(array.get(array.size()-1));
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void getFirst(){
        start = System.nanoTime();
        System.out.println(array.get(0));
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void removeLast(){
        start = System.nanoTime();
        System.out.println(array);
        array.remove(600);
        System.out.println(array);
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void removeFirst(){
        start = System.nanoTime();
        System.out.println(array);
        array.remove(0);
        System.out.println(array);

    }
    public void getMiddle(){
        start = System.nanoTime();
        System.out.println(array.get(450));
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
}
