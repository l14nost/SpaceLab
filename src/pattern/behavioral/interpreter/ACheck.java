package pattern.behavioral.interpreter;

public class ACheck implements Check{
    Check check1;
    Check check2;

    public ACheck(Check check1, Check check2) {
        this.check1 = check1;
        this.check2 = check2;
    }

    @Override
    public boolean check(char symbol) {
        return check1.check(symbol)&&check2.check(symbol);
    }
}
