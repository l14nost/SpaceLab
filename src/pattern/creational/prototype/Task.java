package pattern.creational.prototype;

public class Task implements Clone {
    private String question;
    private String answer;

    public Task(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


    @Override
    public Object clone() {
        Task copy = new Task(question, answer);
        return copy;
    }

    @Override
    public String toString() {
        return "Task{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
