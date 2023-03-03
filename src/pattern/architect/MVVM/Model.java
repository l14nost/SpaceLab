package pattern.architect.MVVM;

import java.util.ArrayList;

public class Model {




    ArrayList<Book> info= new ArrayList<>();
    {
        info.add(new Book("1984"));
        info.add(new Book("Atomic habits"));
        info.add(new Book("Harry Potter"));
        info.add(new Book("Treasure Island"));
    }


}
