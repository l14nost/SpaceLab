package collections.Task5;

public class LMain {


    public static void main(String[] args) {
        LList lList = new LList();
        System.out.println("/");
        lList.addNew();
        System.out.println("/");
        lList.getArr();
        System.out.println("/");
        lList.getLast();
        System.out.println("/");
        lList.last();
        System.out.println("/");
        lList.getLast();
        System.out.println("/");
        lList.middle();
        System.out.println("/");
        System.out.println(lList.linked.get(450));
        System.out.println("/");
        lList.getFirst();
        System.out.println("/");
        lList.removeFirst();
        System.out.println("/");
        System.out.println(lList.linked.get(600));
        lList.removeLast();
        System.out.println(lList.linked.get(600));
    }
}
