package collections.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {
        List<Pearson> list1 = new ArrayList<>();
        {
            list1.add(new Pearson("Oleg5", "Ivanov", 5));
            list1.add(new Pearson("Oleg2", "Ivanov", 2));
            list1.add(new Pearson("Oleg3", "Ivanov", 3));
            list1.add(new Pearson("Oleg1", "Ivanov", 1));
            list1.add(new Pearson("Oleg8", "Ivanov", 8));
            list1.add(new Pearson("Oleg9", "Ivanov", 9));
            list1.add(new Pearson("Oleg7", "Ivanov", 7));
            list1.add(new Pearson("Oleg6", "Ivanov", 6));
            list1.add(new Pearson("Oleg10", "Ivanov", 10));
            list1.add(new Pearson("Oleg4", "Ivanov", 4));
        }
        System.out.println(list1);
        Collections.sort(list1,new AgeComparator());
        System.out.println(list1);



    }
}

