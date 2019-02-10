package webtraining.zone.graphs;

import java.util.*;

public class Graph {
    private Map<Node, List<Node>> adjNodes;

    public Graph() {
        this.adjNodes = new HashMap<>();
    }

    public Graph(Map<Node, List<Node>> adjNodes) {
        this.adjNodes = adjNodes;
    }

    // Graph methods
    public void addNode(Node newNode) {
        this.adjNodes.putIfAbsent(newNode, new LinkedList<>());
    }

    public void removeNode(Node nodeToRemove) {
        this.adjNodes.remove(nodeToRemove);
    }

    public void addEdge(Node nodeOne, Node nodeTwo) {
        List<Node> adjOne = this.adjNodes.get(nodeOne);
        List<Node> adjTwo = this.adjNodes.get(nodeTwo);

        if (!adjOne.contains(nodeTwo)) {
            adjOne.add(nodeTwo);
        }
        if (!adjTwo.contains(nodeOne)) {
            adjTwo.add(nodeOne);
        }
    }

    public void addEdge(String nodeOne, String nodeTwo) {
        this.addEdge(new Node(nodeOne), new Node(nodeTwo));
    }

    public void removeEdge(Node nodeOne, Node nodeTwo) {
        List<Node> listAdjOne = this.adjNodes.get(nodeOne);
        List<Node> listAdjTwo = this.adjNodes.get(nodeTwo);

        if (listAdjOne.size() > 0) {
            listAdjOne.remove(nodeTwo);
        }

        if (listAdjTwo.size() > 0) {
            listAdjTwo.remove(nodeOne);
        }
    }

    // Regular getters and setters
    public Map<Node, List<Node>> getAdjNodes() {
        return this.adjNodes;
    }

    public void setAdjNodes(Map<Node, List<Node>> adjNodes) {
        this.adjNodes = adjNodes;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n", "", "");
        for (Node node : this.adjNodes.keySet()) {
            stringJoiner.add(node.toString());
            stringJoiner.add(this.adjNodes.get(node).toString());
        }

        return stringJoiner.toString();
    }
}
