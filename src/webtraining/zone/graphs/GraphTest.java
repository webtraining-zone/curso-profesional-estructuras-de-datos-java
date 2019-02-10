package webtraining.zone.graphs;

public class GraphTest {
    public static void main(String[] args) {
        // See example: https://visualgo.net/en/graphds
        Graph graph = new Graph();

        for (int i = 0; i < 7; i++) {
            graph.addNode(new Node(String.valueOf(i)));
        }

        graph.addEdge("0", "1");
        graph.addEdge("0", "2");

        graph.addEdge("1", "0");
        graph.addEdge("1", "2");
        graph.addEdge("1", "3");

        graph.addEdge("2", "0");
        graph.addEdge("2", "1");
        graph.addEdge("2", "4");

        graph.addEdge("3", "1");
        graph.addEdge("3", "4");

        graph.addEdge("4", "2");
        graph.addEdge("4", "3");
        graph.addEdge("4", "5");

        graph.addEdge("5", "4");
        graph.addEdge("5", "6");

        graph.addEdge("6", "5");


        System.out.println(graph);

    }
}
