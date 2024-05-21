package Pertemuan11.Tugas1.src;

public class SLLMhs {
    NodeMhs head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            System.out.println("Isi Linked List: ");
            NodeMhs temp = head;
            while (temp != null) {
                System.out.println(temp.nim + " " + temp.nama);
                temp = temp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int nim, String nama) {
        NodeMhs ndInput = new NodeMhs(nim, nama);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        NodeMhs ndInput = new NodeMhs(nim, nama);
        NodeMhs temp = head;
        while (temp != null && temp.nim != key) {
            temp = temp.next;
        }
        if (temp != null) {
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (temp == tail) {
                tail = ndInput;
            }
        } else {
            System.out.println("Node dengan kunci " + key + " tidak ditemukan");
        }
    }

    void insertAt(int index, int nim, String nama) {
        NodeMhs ndInput = new NodeMhs(nim, nama);
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(nim, nama);
        } else {
            NodeMhs temp = head;
            int count = 0;
            while (temp != null && count < index - 1) {
                temp = temp.next;
                count++;
            }
            if (temp != null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (temp == tail) {
                    tail = ndInput;
                }
            } else {
                System.out.println("Indeks melebihi jumlah node");
            }
        }
    }

    void addLast(int nim, String nama) {
        NodeMhs ndInput = new NodeMhs(nim, nama);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
}