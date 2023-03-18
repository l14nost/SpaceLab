package collections.Immutable;

import java.util.*;

public class Immutable {



    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        {
            list.add(1);
            list.add(2);
            list.add(3);

        }
        List<Integer> arr = Collections.unmodifiableList(list);
        for(int x:arr){
            System.out.println(x);
        }
        Set set = Collections.unmodifiableSet(new HashSet<>());
        Map map = Collections.unmodifiableMap(new HashMap<>());

    }

}
