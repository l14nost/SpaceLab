package algorithm.Task7;

import java.util.*;

public class DijkstraAlgorithm {

    private final List<City> nodes;
    private final List<Road> roads;
    private Set<City> settledNodes;
    private Set<City> unSettledNodes;
    private Map<City, City> predecessors;
    private Map<City, Integer> distance;

    public DijkstraAlgorithm(Graph graph) {
        this.nodes = new ArrayList<>(graph.getNodes());
        this.roads = new ArrayList<>(graph.getRoads());
    }

    public void execute(City source) {
        settledNodes = new HashSet<>();
        unSettledNodes = new HashSet<>();
        distance = new HashMap<>();
        predecessors = new HashMap<>();
        distance.put(source, 0);
        unSettledNodes.add(source);
        while (unSettledNodes.size() > 0) {
            City node = getMinimum(unSettledNodes);
            settledNodes.add(node);
            unSettledNodes.remove(node);
            findMinimalDistances(node);
        }
    }

    private void findMinimalDistances(City node) {
        List<City> adjacentNodes = getNeighbors(node);
        for (City target : adjacentNodes) {
            if (getShortestDistance(target) > getShortestDistance(node)
                    + getDistance(node, target)) {
                distance.put(target, getShortestDistance(node)
                        + getDistance(node, target));
                predecessors.put(target, node);
                unSettledNodes.add(target);
            }
        }

    }

    private int getDistance(City node, City target) {
        for (Road edge : roads) {
            if (edge.getSource().equals(node)
                    && edge.getDestination().equals(target)) {
                return edge.getWeight();
            }
        }
        throw new RuntimeException("Should not happen");
    }

    private List<City> getNeighbors(City node) {
        List<City> neighbors = new ArrayList<>();
        for (Road edge : roads) {
            if (edge.getSource().equals(node)
                    && !isSettled(edge.getDestination())) {
                neighbors.add(edge.getDestination());
            }
        }
        return neighbors;
    }

    private City getMinimum(Set<City> vertexes) {
        City minimum = null;
        for (City vertex : vertexes) {
            if (minimum == null) {
                minimum = vertex;
            } else {
                if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
                    minimum = vertex;
                }
            }
        }
        return minimum;
    }

    private boolean isSettled(City vertex) {
        return settledNodes.contains(vertex);
    }

    public int getShortestDistance(City destination) {
        Integer d = distance.get(destination);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }


    public LinkedList<City> getPath(City target) {
        LinkedList<City> path = new LinkedList<>();
        City step = target;

        if (predecessors.get(step) == null) {
            return null;
        }
        path.add(step);
        while((predecessors.get(step)) != null) {
            step = predecessors.get(step);
            path.add(step);
        }

        Collections.reverse(path);
        return path;
    }
    public LinkedList<City> reverseLinkedList(LinkedList<City> list) {
        LinkedList<City> reversed = new LinkedList<>();
        while (!list.isEmpty()) {
            reversed.addFirst(list.removeFirst());
        }
        list.addAll(reversed);
        return list;

    }
}
