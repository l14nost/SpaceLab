package pattern.behavioral.iterator;

import java.util.ArrayList;

public class Team1 implements Team{



    ArrayList<Player> HitWave = new ArrayList<>();
    {
        HitWave.add(new Player("Oleg",10));
        HitWave.add((new Player("Andrey", 5)));
        HitWave.add(new Player("Stepan", 2));
    }



    @Override
    public PlayerIterator getIterator() {
        return new Team1Iterator();
    }

}
