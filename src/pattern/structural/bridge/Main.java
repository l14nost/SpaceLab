package pattern.structural.bridge;

public class Main {
    public static void main(String[] args) {
        KeyForPadlock keyForPadlock = new KeyForPadlock();
        KeyForKnobLocks keyForKnobLocks = new KeyForKnobLocks();
        KnobLocks knobLocks = new KnobLocks(keyForKnobLocks);
        knobLocks.open();
        knobLocks.close();
        KnobLocks knobLocks1 = new KnobLocks(keyForPadlock);
        knobLocks1.open();
        knobLocks1.close();

    }
}
