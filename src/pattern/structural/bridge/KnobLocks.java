package pattern.structural.bridge;

public class KnobLocks extends Lock{

    KeyForKnobLocks keyForKnobLocks = new KeyForKnobLocks();

    public KnobLocks(Key key) {
        super(key);
    }

    @Override
    public void open() {
        if(key.getClass() ==  keyForKnobLocks.getClass()){
            System.out.println("KnobLock open");
            key.fit();
        }
        else {
            key.notFit();
        }

    }

    @Override
    public void close() {
        if(key.getClass() ==  keyForKnobLocks.getClass()){
            System.out.println("KnobLock close");
            key.fit();
        }
        else {
            key.notFit();
        }
    }
}
