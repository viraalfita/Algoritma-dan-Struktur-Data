package Pertemuan11.Tugas2.src;

public class MhsMain {
    public static void main(String[] args) {
        QueueMhs antrian = new QueueMhs();

        antrian.enqueue(101, "Vira");
        antrian.enqueue(102, "Rio");
        antrian.enqueue(103, "Taufik");

        System.out.println("Antrian awal:");
        antrian.displayQueue();

        antrian.dequeue();

        System.out.println("Antrian setelah pemanggilan pertama:");
        antrian.displayQueue();

        antrian.enqueue(104, "Vincent");

        System.out.println("Antrian setelah penambahan:");
        antrian.displayQueue();

        antrian.dequeue();

        System.out.println("Antrian setelah pemanggilan kedua:");
        antrian.displayQueue();
    }
}
