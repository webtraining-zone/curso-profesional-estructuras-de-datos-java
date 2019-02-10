package webtraining.zone.graphs;

import java.util.Objects;

// FYI: A Node is usually called "Vertex"
public class Node {
    private String element;

    public Node(String element) {
        this.element = element;
    }

    //Idea from effective Java : Item 9
//    @Override
//    public int hashCode() {
//        int result = 17;
//        result = 31 * result + this.element.hashCode();
//        return result;
//    }

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
