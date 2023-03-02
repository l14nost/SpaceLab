package pattern.architect.MVC;

import java.io.PrintStream;
import java.util.Scanner;

public class Controller {
    Product model = new Product();
    ViewConsole view = new ViewConsole();
    public void choose(Pearson pearson1){
        System.out.println("balance:"+pearson1.getBalance());
        System.out.println(model.getProduct());
        Pearson pearson = new Pearson();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose product:");
        pearson.choose = in.nextLine();
        System.out.println(""+pearson.choose);
        for (int i=0; i<model.getProduct().size();i++){
            if(model.getProduct().get(i).getName().equals(pearson.choose)){
                Product product = model.getProduct().get(i);
                pearson1.setBalance(pearson1.getBalance() - model.getProduct().get(i).getPrice()) ;
                view.showInfo(product,pearson1);
            }

        }


    }
}
