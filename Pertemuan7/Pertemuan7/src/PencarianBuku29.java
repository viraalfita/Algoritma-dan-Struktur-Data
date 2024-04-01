public class PencarianBuku29 {
    Buku29 listBk[] = new Buku29[3];
    int idx;

    void tambah(Buku29 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku29 m : listBk) {
            if (m != null) {
                m.tampilDataBuku();
            }
        }
    }

    public int findSeqSearch(String cari) {
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                i = posisi;
                break;
            }
        }
        return posisi;
    }

    public int findSeqSearchJudul(String cariJudul) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(cariJudul)) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Peringatan: Lebih dari satu hasil ditemukan untuk judul buku '" + cariJudul + "'.");
        }
        return count;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan!");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t : " + x);
            System.out.println("Judul \t \t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit \t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t : " + listBk[pos].pengarang);
            System.out.println("Stok \t \t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan!");
        }
    }

    public void tampilDataJudul(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t : " + listBk[pos].kodeBuku);
            System.out.println("Judul \t \t : " + x);
            System.out.println("Tahun Terbit \t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t : " + listBk[pos].pengarang);
            System.out.println("Stok \t \t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan!");
        }
    }

    public Buku29 findBuku(String cari) {
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                i = posisi;
                break;
            }
        }
        return listBk[posisi];
    }

    public int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return (mid);
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int findBinarySearchJudul(String cariJudul, int left, int right) {
        bubbleSort();

        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cariJudul.equals(listBk[mid].judulBuku)) {
                int start = mid;
                int end = mid;
                while (start > 0 && listBk[start - 1].judulBuku.equalsIgnoreCase(cariJudul)) {
                    start--;
                }
                while (end < idx - 1 && listBk[end + 1].judulBuku.equalsIgnoreCase(cariJudul)) {
                    end++;
                }
                int count = end - start + 1;
                if (count > 1) {
                    System.out.println(
                            "Peringatan: Lebih dari satu hasil ditemukan untuk judul buku '" + cariJudul + "'.");
                }
                return start;
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(cariJudul) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku29 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }
}
