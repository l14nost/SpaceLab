package algorithm.Task6;

public class Task6 {
    public static void main(String[] args) {
        Pearson pearson = new Pearson("Amir",2,new Address("Torhova",21,"Odessa"));
        Converter converter = new Converter();
        System.out.println(converter.toJSON(pearson));
    }
}
