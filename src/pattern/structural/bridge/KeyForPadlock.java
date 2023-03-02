package pattern.structural.bridge;

public class KeyForPadlock implements Key{


    @Override
    public void fit() {
        System.out.println("Door was open by KeyForPadlock");
    }

    @Override
    public void notFit() {
        System.out.println("KeyForPadlock not fit");
    }
}
