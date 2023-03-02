package pattern.behavioral.state;

public class AverageDay {


    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Pearson pearson = new Pearson();
        pearson.setActivity(activity);
        for(int i = 0; i<10; i++){
            pearson.doActivity();
            pearson.changeActivity();
        }



    }
}
