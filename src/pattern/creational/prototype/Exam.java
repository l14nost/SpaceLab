package pattern.creational.prototype;

public class Exam {
    public static void main(String[] args) {
        Task task = new Task("?","....");
        TaskFactory taskFactory = new TaskFactory(task);
        Task task1 = taskFactory.cloneTask();
        System.out.println(task);
        System.out.println("clone:"+task1);
    }


}
