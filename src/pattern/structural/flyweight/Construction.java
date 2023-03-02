package pattern.structural.flyweight;

import java.util.ArrayList;

public class Construction {
    public static void main(String[] args) {
        MasterFactory masterFactory = new MasterFactory();
        ArrayList<Master> masters = new ArrayList<>();
        for(int i = 0; i<100;i++){
            masters.add(masterFactory.getMaster("builder"));
            masters.add(masterFactory.getMaster("painter"));
        }
        for(Master master:masters){
            master.build();
        }
    }


}
