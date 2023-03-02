package pattern.architect.MVC;

public class ViewConsole {


    public void showInfo(Product product,Pearson pearson) {
        System.out.println("Product:"+product.getName()+" price:"+product.getPrice()+" balance:"+pearson.getBalance());
    }
}
