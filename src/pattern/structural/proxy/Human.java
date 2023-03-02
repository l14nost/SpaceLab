package pattern.structural.proxy;

public class Human implements Club{


    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void dance() {
        System.out.println("human dance");
    }
}
