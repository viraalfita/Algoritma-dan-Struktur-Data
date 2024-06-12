package Pertemuan13.Percobaan;

public class Main {
    public static void main(String[] args) {
        BinaryTree29 tree = new BinaryTree29();

        tree.addRecursive(50);
        tree.addRecursive(30);
        tree.addRecursive(70);
        tree.addRecursive(20);
        tree.addRecursive(40);
        tree.addRecursive(60);
        tree.addRecursive(80);

        System.out.println("Nilai paling kecil di dalam tree : " + tree.findMin());
        System.out.println("Nilai paling besar di dalam tree : " + tree.findMax());

        System.out.print("Pre-Order traversal              : ");
        tree.traversePreOrder(tree.root);
        System.out.println();

        System.out.print("In-Order traversal               : ");
        tree.traverseInOrder(tree.root);
        System.out.println();

        System.out.print("Post-Order traversal             : ");
        tree.traversePostOrder(tree.root);
        System.out.println();

        System.out.print("Leaf nodes                       : ");
        tree.printLeafNodes(tree.root);
        System.out.println();

        System.out.println("Jumlah leaf nodes                : " + tree.countLeafNodes(tree.root));
    }
}
