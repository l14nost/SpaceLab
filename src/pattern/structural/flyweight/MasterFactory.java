package pattern.structural.flyweight;
import java.util.HashMap;
import java.util.Map;

public class MasterFactory {
    private static Map<String, Master> masters = new HashMap<>();
    public Master getMaster(String job){
        Master master = masters.get(job);
        if(master == null&&job.equals("builder")){
            System.out.println("new builder");
            master = new Builder();
        }
        else if(master==null&&job.equals("painter")){
            System.out.println("new painter");
            master = new Painter();
        }
        masters.put(job,master);
        return master;

    }
}
