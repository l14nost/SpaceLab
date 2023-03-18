package collections.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {

    public static void main(String[] args) {
        List<Pearson> list = new ArrayList<>();
        {
            list.add(new Pearson("Oleg5", "Ivanov", 5));
            list.add(new Pearson("Oleg2", "Ivanov", 2));
            list.add(new Pearson("Oleg3", "Ivanov", 3));
            list.add(new Pearson("Oleg1", "Ivanov", 1));
            list.add(new Pearson("Oleg8", "Ivanov", 8));
            list.add(new Pearson("Oleg9", "Ivanov", 9));
            list.add(new Pearson("Oleg7", "Ivanov", 7));
            list.add(new Pearson("Oleg6", "Ivanov", 6));
            list.add(new Pearson("Oleg10", "Ivanov", 10));
            list.add(new Pearson("Oleg4", "Ivanov", 4));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);



    }
}
