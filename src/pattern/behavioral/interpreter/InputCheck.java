package pattern.behavioral.interpreter;

public class InputCheck implements Check{
    String word;

    public InputCheck(String word) {
        this.word = word;
    }

    @Override
    public boolean check(char symbol) {
        if(word.charAt(0) == symbol){
            return true;
        }
        else return false;
    }
}
