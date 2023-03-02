package pattern.behavioral.visitor;

public class Main {


    public static void main(String[] args) {
        Process process = new Process();

        Visitor visitor = new Builder();
        Visitor visitor1 = new Architect();

        process.success(visitor1);
        process.success(visitor);
    }
}
