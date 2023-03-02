package pattern.creational.builder;

//@Builder
public class Developer {
    private String name;
    private String language;
    private int experience;
    private int age;

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", experience=" + experience +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
