package pattern.behavioral.mediator;

public class Main {


    public static void main(String[] args) {
        ChatMediator chat = new ChatMediator();
        User user1 = new UserQueu("user1", chat);
        User user2 = new UserQueu("user2", chat);
        User admin = new Admin("admin",chat);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(admin);

        chat.show();
    }
}
