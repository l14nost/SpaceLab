package pattern.behavioral.observe;

import java.util.List;

public class Pearson implements Subscriber{
    private String name;

    public Pearson(String name) {
        this.name = name;
    }

    @Override
    public void checkEvent(List<String> video) {
        System.out.println("*blump*");
        System.out.println(name+":New video"+video);
    }

    @Override
    public String toString() {
        return "Pearson{" +
                "name='" + name + '\'' +
                '}';
    }
}
