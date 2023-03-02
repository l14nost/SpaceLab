package pattern.behavioral.observe;

public interface Notifier {
    void addSub(Subscriber subs);
    void notifySub();
}
