package pattern.creational.singletone;

public class Bucket {
    private static Bucket bucket;
    private static String product = "Product:";

    private Bucket(String product) {
        this.product = product;

    }

    public static Bucket getBucket(){
        if(bucket == null){
            bucket = new Bucket(product);
        }
        return bucket;
    }
    public void addProduct(String addProduct){
        product += addProduct + " ";

    }
    public void print(){
        System.out.println(product);
    }
}
