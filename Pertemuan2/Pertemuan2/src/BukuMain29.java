public class BukuMain29 {
    public static void main(String[] args) {
        Buku29 bk1 = new Buku29();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku29 bk2 = new Buku29("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku29 bukuVira = new Buku29("Habis Gelap Terbitlah Terang", "RA Kartini", 352, 14, 170000);
        bukuVira.tampilInformasi();
        bukuVira.terjual(1);

        System.out.println("Total Harga  : " + bukuVira.hitungHargaTotal());
        System.out.println("Total Diskon : " + bukuVira.hitungDiskon());
        System.out.println("Total Bayar  : " + bukuVira.hitungHargaBayar());
    }
}