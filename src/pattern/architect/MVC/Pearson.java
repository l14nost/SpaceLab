package pattern.architect.MVC;

import java.util.Scanner;

public class Pearson {
    public String choose;
    private int balance;

    public Pearson(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Pearson() {
    }

    public static void main(String[] args) {
        Pearson pearson1 = new Pearson(1000);
        Controller controller = new Controller();
        controller.choose(pearson1);
    }
}
