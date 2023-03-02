package pattern.creational.builder;

public class HR implements DeveloperBuilder{
    Developer developer = new Developer();
    @Override
    public DeveloperBuilder setName(String name) {
        developer.setName(name);
        return this;
    }

    @Override
    public DeveloperBuilder setLanguage(String language) {
        developer.setLanguage(language);
        return this;
    }

    @Override
    public DeveloperBuilder setExpirience(int experience) {
        developer.setExperience(experience);
        return this;
    }

    @Override
    public DeveloperBuilder setAge(int age) {
        developer.setAge(age);
        return this;
    }

    @Override
    public Developer build() {
        return developer;
    }
}
