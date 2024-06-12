package Pertemuan15.Percobaan1;

public class Node29 {
    int data;
    Node29 next, prev;
    int jarak;

    public Node29(Node29 prev, int data, int jarak, Node29 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
