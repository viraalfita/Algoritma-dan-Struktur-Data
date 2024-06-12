package Pertemuan12.FilmBioskop.src;

public class FilmBioskop29 {
    Node29 head;
    int size;

    public FilmBioskop29() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int idFilm, String judulFilm, double ratingFilm) {
        if (isEmpty()) {
            head = new Node29(null, idFilm, judulFilm, ratingFilm, null);
        } else {
            Node29 newNode = new Node29(null, idFilm, judulFilm, ratingFilm, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int idFilm, String judulFilm, double ratingFilm) {
        if (isEmpty()) {
            addFirst(idFilm, judulFilm, ratingFilm);
        } else {
            Node29 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node29 newNode = new Node29(current, idFilm, judulFilm, ratingFilm, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int idFilm, String judulFilm, double ratingFilm, int index) throws Exception {
        if (isEmpty()) {
            addFirst(idFilm, judulFilm, ratingFilm);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node29 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node29 newNode = new Node29(null, idFilm, judulFilm, ratingFilm, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node29 newNode = new Node29(current.prev, idFilm, judulFilm, ratingFilm, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada film");
        } else {
            Node29 current = head;
            while (current != null) {
                System.out.println(current.idFilm + " " + current.judulFilm + " " + current.ratingFilm);
                current = current.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Data terakhir berhasil dihapus");
            return;
        } else {
            Node29 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
            System.out.println("Data terakhir berhasil dihapus");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Data pertama berhasil dihapus");
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node29 current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data pada indeks " + index + " berhasil dihapus");
        }
    }

    public Node29 cariId(int id) {
        Node29 current = head;
        while (current != null) {
            if (current.idFilm == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void SortDesc() {
        for (Node29 i = head; i != null; i = i.next) {
            for (Node29 j = i.next; j != null; j = j.next) {
                if (i.ratingFilm < j.ratingFilm) {
                    double temp = i.ratingFilm;
                    i.ratingFilm = j.ratingFilm;
                    j.ratingFilm = temp;
                }
            }

        }
    }
}
