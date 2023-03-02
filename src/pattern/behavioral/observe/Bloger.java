package pattern.behavioral.observe;

public class Bloger {


    public static void main(String[] args) {
        YouTube youTube = new YouTube();
        youTube.addVideo("1");
        youTube.addVideo("2");
        Subscriber firstSub = new Pearson("Oleg");
        Subscriber secondSub = new Pearson("Andrey");
        youTube.addSub(firstSub);
        youTube.addSub(secondSub);
        youTube.addVideo("3");

     }
}
