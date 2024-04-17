public class ProsesAngka29 {
    Angka29 angka29 = new Angka29();

    void tampil() {
        for (int i = 0; i < angka29.angka.length; i++) {
            System.out.print(angka29.angka[i] + " ");
        }
    }

    void selectionSortAscending() {
        for (int i = 0; i < angka29.angka.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < angka29.angka.length; j++) {
                if (angka29.angka[j] < angka29.angka[idxMin]) {
                    idxMin = j;
                }
            }

            int temp = angka29.angka[idxMin];
            angka29.angka[idxMin] = angka29.angka[i];
            angka29.angka[i] = temp;
        }
    }

    void selectionSortDescending() {
        for (int i = 0; i < angka29.angka.length; i++) {
            int idxMax = i;
            for (int j = i + 1; j < angka29.angka.length; j++) {
                if (angka29.angka[j] > angka29.angka[idxMax]) {
                    idxMax = j;
                }
            }

            int temp = angka29.angka[idxMax];
            angka29.angka[idxMax] = angka29.angka[i];
            angka29.angka[i] = temp;
        }
    }

    int cariAngka(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == angka29.angka[mid]) {
                return (mid);
            } else if (angka29.angka[mid] > cari) {
                return cariAngka(cari, left, mid - 1);
            } else {
                return cariAngka(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int cariAngkaAscending(int cari, int left, int right) {
        selectionSortAscending();
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == angka29.angka[mid]) {
                return (mid);
            } else if (angka29.angka[mid] > cari) {
                return cariAngkaAscending(cari, left, mid);
            } else {
                return cariAngkaAscending(cari, mid, right);
            }
        }
        return -1;
    }

    int cariAngkaDescending(int cari, int left, int right) {
        selectionSortDescending();
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == angka29.angka[mid]) {
                return (mid);
            } else if (angka29.angka[mid] > cari) {
                return cariAngkaDescending(cari, left, mid);
            } else {
                return cariAngkaDescending(cari, mid, right);
            }
        }
        return -1;
    }

    void tampilPosisi(int x, int posisi) {
        if (posisi != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Data " + x + "tidak ditemukan!");
        }
    }
}
