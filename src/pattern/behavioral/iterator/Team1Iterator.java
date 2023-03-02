package pattern.behavioral.iterator;

public class Team1Iterator implements PlayerIterator{
    int index;
    Team1 team1 = new Team1();
    @Override
    public boolean hasNext() {
        if(index<team1.HitWave.size()){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public Object next() {
        return team1.HitWave.get(index++);
    }
}
