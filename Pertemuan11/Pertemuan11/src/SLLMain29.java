public class SLLMain29 {
    public static void main(String[] args) {
        SingleLinkedList29 singleLL = new SingleLinkedList29();

        singleLL.print();
        singleLL.addFirst(890);
        singleLL.print();
        singleLL.addLast(760);
        singleLL.print();
        singleLL.addFirst(700);
        singleLL.print();
        singleLL.insertAfter(700, 999);
        singleLL.print();
        singleLL.insertAt(3, 833);
        singleLL.print();

        System.out.println("Data pada indeks ke-1= " + singleLL.getData(1));
        System.out.println("Data 760 berada pada indeks ke-" + singleLL.indexOf(760));

        singleLL.remove(999);
        singleLL.print();
        singleLL.removeAt(0);
        singleLL.print();
        singleLL.removeFirst();
        singleLL.print();
        singleLL.removeLast();
        singleLL.print();
    }
}