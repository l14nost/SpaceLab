package pattern.behavioral.observe;

import java.util.List;

public interface Subscriber {
    void checkEvent(List<String> video);
}
