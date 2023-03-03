package pattern.architect.MVP;

import java.util.ArrayList;

public class UserData {
    public UserData() {
    }

    private ArrayList<User> arrUser = new ArrayList<>();
    {
        arrUser.add(new User("andrey","andrey1"));
        arrUser.add(new User("oleg","oleg1"));
        arrUser.add(new User("anton","anton1"));
    }
    public ArrayList<User> getUser(){

        return arrUser;
    }

    public void setUser(User user){
        arrUser.add(user);
        System.out.println(arrUser);
    }

}
