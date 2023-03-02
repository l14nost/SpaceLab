package pattern.behavioral.observe;

import java.util.ArrayList;
import java.util.List;

public class YouTube implements Notifier {
    List<Subscriber> sub = new ArrayList<>();
    List<String> video = new ArrayList<>();
    public void addVideo(String newVideo){
        System.out.println("New Video Add");
        video.add(newVideo);
        notifySub();
    }

    @Override
    public void addSub(Subscriber subs) {
        System.out.println("New Sub"+subs);
        sub.add(subs);
    }

    @Override
    public void notifySub() {
        for(Subscriber subs:sub){
            subs.checkEvent(video);
        }
    }
}
