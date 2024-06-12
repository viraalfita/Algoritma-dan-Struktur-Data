package Pertemuan12.AntrianVaksin.src;

public class Node29 {
    int nomorAntrian;
    String namaPenerima;
    Node29 next, prev;

    public Node29(Node29 prev, int nomorAntrian, String namaPenerima, Node29 next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.namaPenerima = namaPenerima;
        this.next = next;
    }
}
