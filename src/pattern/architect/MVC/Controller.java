package pattern.architect.MVC;

import java.util.Scanner;

public class Controller {
    ProductDB model = new ProductDB();
    ViewConsole view = new ViewConsole();
    public void choose(Pearson pearson1){
        view.showModel(model);
        System.out.println("balance:"+pearson1.getBalance());
        Pearson pearson = new Pearson();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose product:");
        pearson.choose = in.nextLine();
        System.out.println(""+pearson.choose);
        for (int i=0; i<model.getProduct().size();i++){
            if(model.getProduct().get(i).getName().equals(pearson.choose)){
                ProductDB productDB = model.getProduct().get(i);
                pearson1.setBalance(pearson1.getBalance() - model.getProduct().get(i).getPrice()) ;
                view.showInfo(productDB,pearson1);

            }

        }


    }
}
