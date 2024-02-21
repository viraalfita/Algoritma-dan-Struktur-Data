public class Buku29 {
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual = jml;
        } else {
            System.out.println("Stok habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        int hargaTotal = terjual * harga;
        return hargaTotal;
    }

    int hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        int diskon = 0;
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 12 / 100;
        } else if (hargaTotal > 75000 && hargaTotal < 150000) {
            diskon = hargaTotal * 5 / 100;
        } else if (hargaTotal < 75000) {
            diskon = 0;
        } else {
            System.out.println("Harga salah!");
        }

        return diskon;

    }

    int hitungHargaBayar() {
        int hargaTotal = hitungHargaTotal();
        int diskon = hitungDiskon();

        int hargaBayar = hargaTotal - diskon;

        return hargaBayar;
    }

    public Buku29() {

    }

    public Buku29(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
