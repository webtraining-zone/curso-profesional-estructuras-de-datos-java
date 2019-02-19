package webtraining.zone.trees;

import webtraining.zone.queues.Queue;

public class BinaryTree {
    private Node root;

    private Node addRecursive(Node current, String newValue) {
        Node newNode = new Node(newValue);

        if (current == null) {
            return newNode;
        }

        // new < current
        if (newNode.getElement().compareTo(current.getElement()) < 0) {
            current.setLeft(addRecursive(current.getLeft(), newValue));
        }
        // new > current
        else if (newValue.compareTo(current.getElement()) > 0) {
            current.setRight(addRecursive(current.getRight(), newValue));
        }
        // new == current
        else {
            // Value already exists
            return current;
        }

        return current;
    }

    private boolean isNodeInTreeRecursive(Node current, String value) {
        // Is there a root node at least?
        if (current == null) {
            return false;
        }
        // value == current
        if (value.equals(current.getElement())) {
            return true;
        }
        // if (value < 0) go to left
        // else go to right
        return value.compareTo(current.getElement()) < 0
                ? isNodeInTreeRecursive(current.getLeft(), value)
                : isNodeInTreeRecursive(current.getRight(), value);
    }

    // Depth-First Search: in-order
    public void traverseInOrder(Node node) {
        if (node != null) {
            this.traverseInOrder(node.getLeft());
            System.out.print(" " + node.getElement());
            this.traverseInOrder(node.getRight());
        }
    }

    // Depth-First Search: pre-order
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.getElement());
            this.traversePreOrder(node.getLeft());
            this.traversePreOrder(node.getRight());
        }
    }

    // Depth-First Search: post-order
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(" " + node.getElement());
        }
    }

    // Breadth-First Search
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new Queue<>();
        nodes.enqueue(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.dequeue();

            System.out.print(" " + node.getElement());

            if (node.getLeft() != null) {
                nodes.enqueue(node.getLeft());
            }

            if (node.getRight() != null) {
                nodes.enqueue(node.getRight());
            }
        }
    }

    public void add(String newValue) {
        this.root = addRecursive(this.root, newValue);
    }

    public boolean containsNode(String value) {
        return isNodeInTreeRecursive(this.root, value);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
