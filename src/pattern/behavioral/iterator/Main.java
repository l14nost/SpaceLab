package pattern.behavioral.iterator;

public class Main {
    public static void main(String[] args) {

        Team1 team1 = new Team1();
        PlayerIterator iterator = team1.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
