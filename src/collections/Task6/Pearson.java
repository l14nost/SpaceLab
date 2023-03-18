package collections.Task6;

import java.util.ArrayList;
import java.util.List;

public class Pearson implements Comparable<Pearson>{
    String name;
    String surname;
    Integer id;
    public Pearson(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public int compareTo(Pearson pearson) {
        return this.id.compareTo(pearson.id);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pearson pearson = (Pearson) o;

        return id == pearson.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Pearson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
