package pattern.creational.factoryMethod;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal create() {
        return new Dog();
    }
}
