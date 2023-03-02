package pattern.creational.prototype;

public class TaskFactory{
    Task task;

    public TaskFactory(Task task) {
        this.task = task;
    }


    public void setTask(Task task) {
        this.task = task;
    }
    Task cloneTask(){
        return (Task) task.clone();
    }


}
