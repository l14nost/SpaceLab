package pattern.structural.decorator;

public class Family {
    public static void main(String[] args) {
        Human human = new Father(new Mother(new Son()));
        System.out.println(human.watchTv());
        Human human1 =new Mother(new Son());
        System.out.println(human1.watchTv());
        Human human2 = new Son();
        System.out.println(human2.watchTv());
    }
}
