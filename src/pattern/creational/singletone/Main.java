package pattern.creational.singletone;

public class Main {
    public static void main(String[] args) {
        Bucket.getBucket().addProduct("meat");
        Bucket.getBucket().addProduct("milk");
        Bucket.getBucket().print();
    }
}
