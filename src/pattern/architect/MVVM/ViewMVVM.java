package pattern.architect.MVVM;

import java.util.Scanner;

public class ViewMVVM {
    Scanner in = new Scanner(System.in);
    ViewModel viewModel = new ViewModel();
    private String answer;


    public void showInfo(){
        System.out.println(viewModel.getBook());
    }
    public void askInfo(){
        System.out.println("What book do you want?");
        answer = in.nextLine();
        viewModel.newArr(answer);
    }
}
