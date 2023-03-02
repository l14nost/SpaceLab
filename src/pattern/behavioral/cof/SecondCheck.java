package pattern.behavioral.cof;

public class SecondCheck extends Task {
    String result;



    @Override
    public void print(String message, int x, int y) {
        if(x+y==5){
            System.out.println(x+"+"+y+"=="+"5"+"\nSuccessful");
        }
        else {
            System.out.println(x+"+"+y+"!="+"5"+"\nWrong");
        }
    }
}
