package pattern.behavioral.mediator;

public class Admin implements User{
    String name;
    Chat chat;

    public Admin(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    @Override
    public void say() {
        System.out.println("user say");
    }
}
