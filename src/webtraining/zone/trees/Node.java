package webtraining.zone.trees;

import java.util.Objects;

// Inspired by https://www.baeldung.com/java-binary-tree
public class Node {
    private String element;
    private Node left;
    private Node right;

    public Node(String element) {
        this.element = element;
        this.right = null;
        this.left = null;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    // For JDK 7 and above, you can use the new Objects class to generate the equals and hash code values.
    public int hashCode() {
        return Objects.hash(this.element);
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Node)) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        return this.element != null && ((Node) obj).element != null
                && this.element.equals(((Node) obj).element)
                && ((Node) obj).element.equals(this.element);
    }

    @Override
    public String toString() {
        return this.element;
    }
}
