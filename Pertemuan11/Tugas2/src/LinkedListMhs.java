package Pertemuan11.Tugas2.src;

public class LinkedListMhs {
    NodeMhs head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void addLast(int nim, String nama) {
        NodeMhs newNode = new NodeMhs(nim, nama);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void displayList() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            System.out.println("Isi linked list:");
            NodeMhs current = head;
            while (current != null) {
                System.out.println(current.nim + " " + current.nama);
                current = current.next;
            }
        }
    }
}