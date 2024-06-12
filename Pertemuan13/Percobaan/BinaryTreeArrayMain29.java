public class BinaryTreeArrayMain29 {
    public static void main(String[] args) {
        BinaryTreeArray29 bta = new BinaryTreeArray29();
        bta.add(10);
        bta.add(5);
        bta.add(15);
        bta.add(2);
        bta.add(7);
        bta.add(12);
        bta.add(20);

        System.out.print("InOrder: ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("PreOrder: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("PostOrder: ");
        bta.traversePostOrder(0);
        System.out.println();
    }

}
