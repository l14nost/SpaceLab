package pattern.behavioral.cof;

public class ThirdCheck extends Task {




    @Override
    public void print(String message, int x, int y) {
        if(x*y==6&&x+y==5){
            System.out.println("Successful");
        }
        else {
            System.out.println("Wrong");
        }
    }
}
