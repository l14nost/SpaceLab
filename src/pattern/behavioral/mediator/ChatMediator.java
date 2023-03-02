package pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Chat{

    List<User> users = new ArrayList<>();
    public void addUser(User user){
        this.users.add(user);
    }
    @Override
    public void show() {
        for (User user:users){
            if(user instanceof UserQueu){
                user.say();
            }
            else {
                System.out.println("Admin:");
                user.say();
            }


        }
    }
}
