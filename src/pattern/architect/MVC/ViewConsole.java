package pattern.architect.MVC;

import pattern.architect.MVVM.Model;

public class ViewConsole {


    public void showInfo(ProductDB productDB, Pearson pearson) {
        System.out.println("Product:"+ productDB.getName()+" price:"+ productDB.getPrice()+" balance:"+pearson.getBalance());
    }
    public void showModel(ProductDB model){
        System.out.println(model.getProduct());
    }
}
