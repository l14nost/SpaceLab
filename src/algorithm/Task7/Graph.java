package algorithm.Task7;

import java.util.List;

public class Graph {
    private final List<City> nodes;
    private final List<Road> roads;

    public Graph(List<City> nodes, List<Road> roads) {
        this.nodes = nodes;
        this.roads = roads;
    }

    public List<City> getNodes() {
        return nodes;
    }

    public List<Road> getRoads() {
        return roads;
    }
}
