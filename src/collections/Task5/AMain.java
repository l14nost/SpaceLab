package collections.Task5;

public class AMain {
    public static void main(String[] args) {
        Alist aList = new Alist();
        System.out.println("/");
        aList.addNew();
        System.out.println("/");
        aList.getArr();
        System.out.println("/");
        aList.getLast();
        System.out.println("/");
        aList.last();
        System.out.println("/");
        aList.getLast();
        System.out.println("/");
        aList.middle();
        System.out.println("/");
        aList.getMiddle();
        System.out.println("/");
        aList.getFirst();
        System.out.println("/");
        aList.removeFirst();
        System.out.println("/");
        System.out.println(aList.array.get(600));
        aList.removeLast();
        System.out.println(aList.array.get(600));
    }
    }

