package collections.GenWild;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Generics
//        Generics<User> generics = new Generics<>();
//        System.out.println(generics.getType());
//        generics.setType(new User("Oleg",1));
//        System.out.println(generics.getType());
        //WildCard
        List<User1> user1 = new ArrayList<>();
        {
            user1.add(new User1("Oleg",1,19));
        }
        List<User> user = new ArrayList<>();
        {
            user.add(new User("Andrey",2));
        }
        List<User2> user2 = new ArrayList<>();
        {
            user2.add(new User2("hat"));
        }
        WildCard.all(user2);
        WildCard.all(user1);
        WildCard.all(user);
        WildCard.extend(user1);
        WildCard.extend(user);
//        WildCard.extend(user2);
    }
}
