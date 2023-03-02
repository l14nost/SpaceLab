package pattern.structural.bridge;

public class KeyForKnobLocks implements Key{

    @Override
    public void fit() {
        System.out.println("Door was open by KeyForKnobLock");
    }

    @Override
    public void notFit() {
        System.out.println("KeyForKnobLock not fit");
    }
}
