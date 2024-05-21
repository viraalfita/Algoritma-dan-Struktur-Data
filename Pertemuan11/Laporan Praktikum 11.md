<div align="center">

# Algoritma dan Struktur Data

<img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="Gambar" style="height: 200px">

<p>Vira Alfita Yunia</p>
<p>TI-1B</p>
<p>29</p>
<p>2341720055</p>

</div>

<hr>

## Pertemuan 11 (Linked List)

### Percobaan 1

<p>Kode program</p>
<p>Node29.java</p>

    public class Node29 {
        int data;
        Node29 next;

        public Node29(int nilai, Node29 berikutnya) {
            data = nilai;
            next = berikutnya;
        }

    }

<p>SingleLinkedList29.java</p>

    public class SingleLinkedList29 {
        Node29 head, tail;

        boolean isEmpty() {
            return head == null;
        }

        void print() {
            if (!isEmpty()) {
                System.out.print("Isi Linked List: ");
                Node29 temp = head;
                while (temp != null) {
                    System.out.print(temp.data + "\t");
                    temp = temp.next;
                }
                System.out.println();
            } else {
                System.out.println("Linked List Kosong");
            }
        }

        void addFirst(int input) {
            Node29 ndInput = new Node29(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                ndInput.next = head;
                head = ndInput;
            }
        }

        void addLast(int input) {
            Node29 ndInput = new Node29(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                tail.next = ndInput;
                tail = ndInput;
            }
        }

        void insertAfter(int key, int input) {
            Node29 ndInput = new Node29(input, null);
            Node29 temp = head;
            boolean keyFound = false;

            while (temp != null) {
                if (temp.data == key) {
                    keyFound = true;
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if (ndInput.next == null) {
                        tail = ndInput;
                    }
                    break;
                }
                temp = temp.next;
            }

            if (!keyFound) {
                System.out.println("Key tidak ditemukan");
            }
        }

        void insertAt(int index, int input) {
            Node29 ndInput = new Node29(input, null);
            if (index < 0) {
                System.out.println("Index Tidak Valid");
                return;
            } else if (index == 0) {
                addFirst(input);
                return;
            }

            Node29 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node29(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

<p>SLLMain29.java</p>

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
        }
    }

<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Percobaan 1.png">

#### Pertanyaan

<strong><p>Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?<p></strong>

<p>Karena di baris pertama program utama (SingleLinkedList29 singleLL = new SingleLinkedList29();), Anda membuat instance dari kelas SingleLinkedList29 dengan nama singleLL. Namun, pada saat instance itu dibuat, belum ada node yang ditambahkan ke dalam linked list. Oleh karena itu, pada saat metode print() dipanggil untuk mencetak isi dari linked list, kondisi isEmpty() akan mengembalikan true, karena head masih null. Sehingga, pesan yang dicetak adalah "Linked List Kosong".</p>

<strong><p>Jelaskan kegunaan variable temp secara umum pada setiap method!<p></strong>

<p> Metode print():
        Variabel temp digunakan untuk menginisialisasi penelusuran dari node pertama (head) hingga node terakhir (tail) dalam linked list.
        Dalam perulangan while, temp digunakan untuk mengunjungi setiap node dalam linked list untuk mencetak datanya.

    Metode addFirst():
        Variabel temp tidak digunakan dalam metode ini karena penambahan node baru dilakukan di awal linked list.

    Metode addLast():
        Variabel temp digunakan untuk menginisialisasi penelusuran dari node pertama (head) hingga node terakhir (tail) dalam linked list.
        Dalam metode ini, variabel temp digunakan untuk mencapai node terakhir dalam linked list sehingga node baru dapat ditambahkan setelahnya.

    Metode insertAfter():
        Variabel temp digunakan untuk menginisialisasi penelusuran dari node pertama (head) hingga node terakhir (tail) dalam linked list.
        temp digunakan untuk menemukan node dengan nilai yang sesuai dengan kunci yang ditentukan.

    Metode insertAt():
        Variabel temp digunakan untuk menginisialisasi penelusuran dari node pertama (head) hingga node terakhir (tail) dalam linked list.
        Dalam metode ini, variabel temp digunakan untuk mencapai node sebelum indeks yang ditentukan sehingga node baru dapat dimasukkan setelahnya.</p>

<strong><p>Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut<p></strong>

<p>Kode tersebut digunakan untuk memperbarui tail jika node yang baru disisipkan berada di posisi terakhir dalam linked list. Ini diperlukan karena jika node baru disisipkan di akhir, maka node baru tersebut harus diatur sebagai ekor (tail) karena itu akan menjadi elemen terakhir dalam linked list.</p>

### Percobaan 2

<p>Kode program</p>
<p>SingleLinkedList29.java</p>

    public class SingleLinkedList29 {
        Node29 head, tail;

        boolean isEmpty() {
            return head == null;
        }

        void print() {
            if (!isEmpty()) {
                System.out.print("Isi Linked List: ");
                Node29 temp = head;
                while (temp != null) {
                    System.out.print(temp.data + "\t");
                    temp = temp.next;
                }
                System.out.println();
            } else {
                System.out.println("Linked List Kosong");
            }
        }

        void addFirst(int input) {
            Node29 ndInput = new Node29(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                ndInput.next = head;
                head = ndInput;
            }
        }

        void addLast(int input) {
            Node29 ndInput = new Node29(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                tail.next = ndInput;
                tail = ndInput;
            }
        }

        void insertAfter(int key, int input) {
            Node29 ndInput = new Node29(input, null);
            Node29 temp = head;
            boolean keyFound = false;

            while (temp != null) {
                if (temp.data == key) {
                    keyFound = true;
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if (ndInput.next == null) {
                        tail = ndInput;
                    }
                    break;
                }
                temp = temp.next;
            }

            if (!keyFound) {
                System.out.println("Key tidak ditemukan");
            }
        }

        void insertAt(int index, int input) {
            Node29 ndInput = new Node29(input, null);
            if (index < 0) {
                System.out.println("Index Tidak Valid");
                return;
            } else if (index == 0) {
                addFirst(input);
                return;
            }

            Node29 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node29(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }

        int getData(int index) {
            Node29 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }

        int indexOf(int key) {
            Node29 temp = head;
            int index = 0;
            while (temp != null && temp.data != key) {
                temp = temp.next;
                index++;
            }
            if (temp == null) {
                return -1; // Key tidak ditemukan
            } else {
                return index;
            }
        }

        void removeFirst() {
            if (isEmpty()) {
                System.out.println("Linked list masih kosong, tidak dapat dihapus");
            } else if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }

        void removeLast() {
            if (isEmpty()) {
                System.out.println("Linked list masih kosong, tidak dapat dihapus");
            } else if (head == tail) {
                head = tail = null;
            } else {
                Node29 temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }

        void remove(int key) {
            if (isEmpty()) {
                System.out.println("Linked list masih kosong, tidak dapat dihapus");
            } else {
                Node29 temp = head;
                while (temp != null) {
                    if (temp.data != key && temp == head) {
                        removeFirst();
                        break;
                    } else if (temp.next != null && temp.next.data == key) {
                        temp.next = temp.next.next;
                        if (temp.next == null) {
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                }
            }
        }

        void removeAt(int index) {
            if (index == 0) {
                removeFirst();
            } else {
                Node29 temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }
    }

<p>SLLMain29.java</p>

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

<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Percobaan 2.png">

#### Pertanyaan

<strong><p>Mengapa digunakan keyword break pada fungsi remove? Jelaskan!<p></strong>

<p>Fungsi break digunakan untuk keluar dari kondisi percabangan setelah melakukan pemanggilan method removeFirst</p>

<strong><p>Jelaskan kegunaan kode dibawah pada method remove<p></strong>

<p>Kode di atas digunakan untuk menghapus node dari linked list jika node tersebut memiliki nilai data yang sama dengan key</p>

### Tugas No. 1

<p>Kode program</p>
<p>NodeMhs.java</p>

    package Pertemuan11.Tugas1.src;

    public class NodeMhs {
        int nim;
        String nama;
        NodeMhs next;

        public NodeMhs(int nim, String nama) {
            this.nim = nim;
            this.nama = nama;
            this.next = null;
        }

    }

<p>SLLMhs.java</p>

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

<p>Main.java</p>

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

<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Tugas 1.png">

### Tugas 2

<p>Kode program</p>
<p>NodeMhs.java</p>

    package Pertemuan11.Tugas2.src;

    public class NodeMhs {
        int nim;
        String nama;
        NodeMhs next;

        public NodeMhs(int nim, String nama) {
            this.nim = nim;
            this.nama = nama;
            this.next = null;
        }
    }

<p>LinkedListMhs.java</p>

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

<p>QueueMhs.java</p>

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

<p>MhsMain.java</p>

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

<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Tugas 2.png">
