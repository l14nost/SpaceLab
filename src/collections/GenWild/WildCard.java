package collections.GenWild;

import java.util.List;

public class WildCard {
    public static void all(List<?> list){
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void extend(List<? extends User> list1){
        for (User x :list1){
            System.out.println(x);
        }
    }
}
