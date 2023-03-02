package pattern.structural.bridge;

public abstract class Lock {
    protected Key key;

    public Lock(Key key) {
        this.key = key;
    }

    public abstract void open();


    public abstract void close();

    ;

}
