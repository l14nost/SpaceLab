package pattern.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Check aCheck = ACheck();
        Check bCheck = BCheck();
        System.out.println("A "+aCheck.check('A'));
        System.out.println("b "+bCheck.check('B'));
    }
    public static Check ACheck(){
        Check first = new InputCheck("Asasda");
        Check second = new InputCheck("Aasasd");
        return new ACheck(first,second);
    }
    public static Check BCheck(){
        Check first = new InputCheck("Bsasda");
        Check second = new InputCheck("Basasd");
        return new BCheck(first,second);
    }
}
