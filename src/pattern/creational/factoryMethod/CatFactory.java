package pattern.creational.factoryMethod;

public class CatFactory implements AnimalFactory{
    @Override
    public Animal create() {
        return new Cat();
    }
}
