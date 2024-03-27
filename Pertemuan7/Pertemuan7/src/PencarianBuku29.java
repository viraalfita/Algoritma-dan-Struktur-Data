public class PencarianBuku29 {
    Buku29 listBk[] = new Buku29[5];
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

    public int findSeqSearch(int cari) {
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                i = posisi;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan!");
        }
    }

    public void tampilData(int x, int pos) {
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

    public Buku29 findBuku(int cari) {
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                i = posisi;
                break;
            }
        }
        return listBk[posisi];
    }

    public int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return findBinarySearch(cari, left, mid);
            } else {
                return findBinarySearch(cari, mid, right);
            }
        }
        return -1;
    }
}
