package collections.GenWild;

public class User1 extends User{
    private int age;

    public User1(String name, int num, int age) {
        super(name, num);
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name="+ getName()+
                ", num = "+getNum()+
                ", age=" + age +
                '}';
    }
}
