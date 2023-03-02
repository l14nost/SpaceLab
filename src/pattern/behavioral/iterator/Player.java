package pattern.behavioral.iterator;

public class Player {
    private String name;

    public int getNum() {
        return num;
    }

    private int num;

    public Player(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
