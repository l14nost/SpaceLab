package pattern.creational.factoryMethod;

public class AnimalSound {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new CatFactory();
        AnimalFactory animalFactory1 = new DogFactory();
        Animal animal = animalFactory.create();
        Animal animal1 = animalFactory1.create();
        animal.sound();
        animal1.sound();
    }


}
