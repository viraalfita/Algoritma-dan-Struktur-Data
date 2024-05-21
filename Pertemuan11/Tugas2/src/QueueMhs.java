package Pertemuan11.Tugas2.src;

public class QueueMhs {
    LinkedListMhs queueList = new LinkedListMhs();

    void enqueue(int nim, String nama) {
        queueList.addLast(nim, nama);
    }

    void dequeue() {
        if (queueList.isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa yang dilayani: " + queueList.head.nim + " " + queueList.head.nama);
            queueList.head = queueList.head.next;
            if (queueList.head == null) {
                queueList.tail = null;
            }
        }
    }

    void displayQueue() {
        queueList.displayList();
    }
}
