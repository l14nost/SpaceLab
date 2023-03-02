package pattern.creational.builder;

public interface DeveloperBuilder {
    DeveloperBuilder setName(String name);
    DeveloperBuilder setLanguage(String language);
    DeveloperBuilder setExpirience(int expirience);
    DeveloperBuilder setAge(int age);
    Developer build();

}
