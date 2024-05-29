public class AntrianVaksin29 {
    Node29 head;
    int size;

    public AntrianVaksin29() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nomorAntrian, String namaPenerima) {
        if (isEmpty()) {
            head = new Node29(null, nomorAntrian, namaPenerima, null);
        } else {
            Node29 newNode = new Node29(null, nomorAntrian, namaPenerima, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nomorAntrian, String namaPenerima) {
        if (isEmpty()) {
            addFirst(nomorAntrian, namaPenerima);
        } else {
            Node29 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node29 newNode = new Node29(current, nomorAntrian, namaPenerima, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        } else if (size == 1) {
            System.out.println(head.namaPenerima + " telah selesai divaksinasi.");
            removeLast();
        } else {
            System.out.println(head.namaPenerima + " telah selesai divaksinasi.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        } else if (head.next == null) {
            System.out.println(head.namaPenerima + " telah selesai divaksinasi.");
            head = null;
            size--;
            return;
        } else {
            Node29 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            System.out.println(current.namaPenerima + " telah selesai divaksinasi.");
            current.next = null;
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node29 current = head;
            System.out.println("+----------------------------+");
            System.out.println("|   Daftar Pengantri Vaksin  |");
            System.out.println("+----------------------------+");
            System.out.println("| No Antrian | Nama Penerima |");
            System.out.println("+------------+---------------+");
            while (current != null) {
                System.out.printf("| %-10d | %-13s |\n", current.nomorAntrian, current.namaPenerima);
                current = current.next;
            }
            System.out.println("+------------+---------------+");
        }
    }

}