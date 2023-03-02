package pattern.behavioral.mediator;

public class UserQueu implements User{
    String name;
    Chat chat;

    public UserQueu(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    @Override
    public void say() {
        System.out.println("user say");
    }


}
