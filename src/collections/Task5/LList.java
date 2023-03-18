package collections.Task5;

import java.util.LinkedList;
import java.util.List;

public class LList {
    List<Integer> linked = new LinkedList<>();
    long start, stop;
    public void addNew(){
        start = System.nanoTime();
        for(int i = 0; i<1001; i++){
            int a = (int) (Math.random()*(600+1)) - 200;
            linked.add(a);
        }
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void getArr(){
        System.out.println(linked);
    }
    public void last(){
        start = System.nanoTime();
        linked.add(0);
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void middle(){
        start = System.nanoTime();
        linked.add(450,10000);
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void getLast(){
        start = System.nanoTime();
        System.out.println(linked.get(linked.size()-1));
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void getFirst(){
        start = System.nanoTime();
        System.out.println(linked.get(0));
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void removeLast(){
        start = System.nanoTime();
        System.out.println(linked);
        linked.remove(600);
        System.out.println(linked);
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }
    public void removeFirst(){
        start = System.nanoTime();
        System.out.println(linked);
        linked.remove(100);
        System.out.println(linked);
        stop = System.nanoTime();
        System.out.println("time:"+(stop-start));
    }




}
