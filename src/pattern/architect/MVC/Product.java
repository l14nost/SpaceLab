package pattern.architect.MVC;

import java.util.ArrayList;


public class Product {
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;
    private int price;


    public ArrayList<Product> getProduct() {
        ArrayList<Product> productMap = new ArrayList<>();
        {
            productMap.add(new Product("meat", 100));
            productMap.add(new Product("milk", 50));
            productMap.add(new Product("fruit", 10));
            productMap.add(new Product("vegetables", 10));
        }
        return productMap;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
