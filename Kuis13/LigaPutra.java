package Kuis13;

public class LigaPutra {
    NodePutra head, tail;

    boolean isEmpty() {
        return head == null;
    }

    public void tambahTim(String nama) {
        NodePutra timBaru = new NodePutra(nama);

        if (isEmpty()) {
            head = timBaru;
        } else {
            NodePutra temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = timBaru;
        }
        System.out.println("\u001B[32mTim berhasil ditambahkan: " + nama + "\u001B[0m");
    }

    public void tampilkanTim() {
        if (isEmpty()) {
            System.out.println("Liga masih kosong.");
        } else {
            System.out.println("+----------------------------------+");
            System.out.println("|     List Tim Proliga Voli 2024   |");
            System.out.println("+----------------------------------+");
            System.out.println("| No | Nama Tim                    |");
            System.out.println("+---------------------------------+");

            NodePutra temp = head;
            int nomor = 1;
            while (temp != null) {
                System.out.printf("| %-3d| %-28s|%n", nomor, temp.nama);
                temp = temp.next;
                nomor++;
            }

            System.out.println("+---------------------------------+");
        }
    }

    public void catatPertandingan(String tim1, String tim2, String pemenang, String skor) {
        NodePutra t1 = cariTim(tim1);
        NodePutra t2 = cariTim(tim2);

        if (t1 == null || t2 == null) {
            System.out.println("Salah satu atau kedua tim tidak ditemukan.");
            return;
        }

        t1.main++;
        t2.main++;

        switch (skor) {
            case "3-0":
                if (pemenang.equals(tim1)) {
                    t1.menang++;
                    t1.poin += 3;
                    t1.menang3_0++;
                    t2.kalah++;
                    t2.kalah0_3++;
                } else if (pemenang.equals(tim2)) {
                    t2.menang++;
                    t2.poin += 3;
                    t2.menang3_0++;
                    t1.kalah++;
                    t1.kalah0_3++;
                }
                break;
            case "3-1":
                if (pemenang.equals(tim1)) {
                    t1.menang++;
                    t1.poin += 3;
                    t1.menang3_1++;
                    t2.kalah++;
                    t2.kalah1_3++;
                } else if (pemenang.equals(tim2)) {
                    t2.menang++;
                    t2.poin += 3;
                    t2.menang3_1++;
                    t1.kalah++;
                    t1.kalah1_3++;
                }
                break;
            case "3-2":
                if (pemenang.equals(tim1)) {
                    t1.menang++;
                    t1.poin += 3;
                    t1.menang3_2++;
                    t2.kalah++;
                    t2.kalah2_3++;
                } else if (pemenang.equals(tim2)) {
                    t2.menang++;
                    t2.poin += 3;
                    t2.menang3_2++;
                    t1.kalah++;
                    t1.kalah2_3++;
                }
                break;
            default:
                System.out.println("Skor tidak valid.");
                return;
        }
        System.out.println("\u001B[32mPertandingan berhasil dicatat.\u001B[0m");
    }

    public NodePutra cariTim(String nama) {
        NodePutra temp = head;
        while (temp != null) {
            if (temp.nama.equals(nama)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    private void urutkanTimBerdasarkanPoin() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            NodePutra current = head;
            NodePutra previous = null;
            NodePutra next = head.next;
            swapped = false;

            while (next != null) {
                if (current.poin < next.poin) {
                    swapped = true;
                    if (previous != null) {
                        NodePutra temp = next.next;
                        previous.next = next;
                        next.next = current;
                        current.next = temp;
                    } else {
                        NodePutra temp = next.next;
                        head = next;
                        next.next = current;
                        current.next = temp;
                    }
                    previous = next;
                    next = current.next;
                } else {
                    previous = current;
                    current = next;
                    next = next.next;
                }
            }
        } while (swapped);
    }

    public void tampilkanKlasemen() {
        urutkanTimBerdasarkanPoin();

        String formatTabel = "| %-15s | %-5d | %-5d | %-5d | %-5d | %-5d | %-5d | %-5d | %-5d | %-5d | %-5d | %-6.2f |%n";

        System.out.format(
                "+-----------------+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+--------+%n");
        System.out.format(
                "| Tim             | Main  | Win   | Lose  | Pts   | 3-0   | 3-1   | 3-2   | 2-3   | 1-3   | 0-3   | Ratio  |%n");
        System.out.format(
                "+-----------------+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+--------+%n");

        NodePutra temp = head;
        while (temp != null) {
            double ratio = (temp.kalah == 0) ? temp.menang : (double) temp.menang / temp.kalah;
            System.out.format(formatTabel, temp.nama, temp.main, temp.menang, temp.kalah, temp.poin,
                    temp.menang3_0, temp.menang3_1, temp.menang3_2, temp.kalah2_3, temp.kalah1_3, temp.kalah0_3, ratio);
            temp = temp.next;
        }

        System.out.format(
                "+-----------------+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+--------+%n");
    }

}
