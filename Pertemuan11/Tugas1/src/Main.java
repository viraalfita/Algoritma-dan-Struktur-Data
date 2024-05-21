package Pertemuan11.Tugas1.src;

public class Main {
    public static void main(String[] args) {
        SLLMhs linkedList = new SLLMhs();

        linkedList.addFirst(111, "Anton");

        linkedList.addLast(115, "Sari");

        linkedList.print();

        linkedList.insertAfter(111, 112, "Prita");

        linkedList.print();

        linkedList.insertAt(2, 113, "Yusuf");

        linkedList.print();

        linkedList.insertAfter(113, 114, "Doni");

        linkedList.print();

        linkedList.print();
    }
}
