package algorithm.Task4;

import java.util.Scanner;
import java.util.Stack;

public class Task4 {

    public String answer(){
        String answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        answer = in.nextLine();
        return answer;
    }
    public void result(boolean check){
        if(check == true){
            System.out.println("() are placed correctly");
        }
        else {
            System.out.println("() aren't placed correctly");
        }
    }
    public boolean check(String answer){
        boolean check = true;
        Stack<Character> stack = new Stack<>();
        char[] arr = answer.toCharArray();
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == '(' ){
                stack.push(arr[i]);
                if (check == false) {
                    stack.pop();
                }
            } else if (arr[i]==')') {
                if(stack.empty()){
                    check = false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
