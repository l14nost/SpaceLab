package algorithm.Task2;

public class Main {

    public static void main(String[] args) {
        Tree root = new Tree('A',
                new Tree('B',
                        new Tree('C',new Tree('D',null,null),new Tree('E',null,null)),
                                new Tree('F',new Tree('G',null,null),new Tree('H',null,null))),
                new Tree('I',
                        new Tree('J',null,null),new Tree('K',null,null)));
        System.out.println(root.recurs());
        System.out.println(root.iterWide(root));
    }
}
