package pattern.structural.bridge;

public class Padlock extends Lock{
    KeyForPadlock keyForPadlock = new KeyForPadlock();


    public Padlock(Key key) {
        super(key);
    }

    @Override
    public void open() {
        if(key.getClass() ==  keyForPadlock.getClass()){
            System.out.println("Padlock open");
            key.fit();
        }
        else {
            key.notFit();
        }
    }

    @Override
    public void close() {
        if(key.getClass() ==  keyForPadlock.getClass()){
            System.out.println("Padlock close");
            key.fit();
        }
        else {
            key.notFit();
        }
    }
}
