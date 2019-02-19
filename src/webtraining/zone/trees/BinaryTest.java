package webtraining.zone.trees;

public class BinaryTest {
    public static void main(String[] args) {
        // https://visualgo.net/en/bst
        BinaryTree binaryTree = new BinaryTree();

//        binaryTree.add("6");
//        binaryTree.add("27");
//        binaryTree.add("14");
//        binaryTree.add("21");
//        binaryTree.add("8");
//        binaryTree.add("80");
//        binaryTree.add("99");
//        binaryTree.add("82");
//        binaryTree.add("59");
//        binaryTree.add("41");
//        binaryTree.add("27");

        // FIXME: This tree is balanced on purpose, in general a binary tree is NOT necessarily balanced
        binaryTree.add("6");
        binaryTree.add("4");
        binaryTree.add("8");
        binaryTree.add("3");
        binaryTree.add("5");
        binaryTree.add("7");
        binaryTree.add("9");

        // Try to find a node
        System.out.println("80: " + binaryTree.containsNode("9"));
        System.out.println("150: " + binaryTree.containsNode("150"));

        System.out.println("Depth-First Search");
        // Traverse pre-order
        Node root = binaryTree.getRoot();
        System.out.println("Root: " + root.getElement());

        // 6 4 3 5 8 7 9
        System.out.println("\nPre-order");
        binaryTree.traversePreOrder(root);

        // 3 4 5 6 7 8 9
        System.out.println("\n\nIn-order");
        binaryTree.traverseInOrder(root);

        // 3 5 4 7 9 8 6
        System.out.println("\n\nPost-order");
        binaryTree.traversePostOrder(root);

        System.out.println("\n\nBreath-First Search");
        // 6 4 8 3 5 7 9
        binaryTree.traverseLevelOrder();

    }
}
