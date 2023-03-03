package pattern.architect.MVC;

import java.util.ArrayList;


public class ProductDB {
    public ProductDB(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public ProductDB() {
    }

    public String getName() {
        return name;
    }



    public int getPrice() {
        return price;
    }



    private String name;
    private int price;


    public ArrayList<ProductDB> getProduct() {
        ArrayList<ProductDB> productDBMap = new ArrayList<>();
        {
            productDBMap.add(new ProductDB("meat", 100));
            productDBMap.add(new ProductDB("milk", 50));
            productDBMap.add(new ProductDB("fruit", 10));
            productDBMap.add(new ProductDB("vegetables", 10));
        }
        return productDBMap;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
