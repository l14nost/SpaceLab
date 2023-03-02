package pattern.behavioral.cof;

public class FirstCheck extends Task {




    @Override
    public void print(String message, int x, int y) {
        if(x*y==6){
            System.out.println(x+"*"+y+"=="+"6"+"\nSuccessful");
        }
        else {
            System.out.println(x+"*"+y+"!="+"6"+"\nWrong");
        }
    }
}
