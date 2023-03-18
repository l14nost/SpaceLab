package algorithm.Task7;

public class Road {
    private final City source;
    private final City destination;
    private final int weight;

    public Road(City source, City destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public City getSource() {
        return source;
    }

    public City getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
