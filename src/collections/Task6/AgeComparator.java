package collections.Task6;

import java.util.Comparator;

public class AgeComparator implements Comparator<Pearson> {
    @Override
    public int compare(Pearson per1, Pearson per2) {
        return per1.id.compareTo(per2.id);
    }
}
