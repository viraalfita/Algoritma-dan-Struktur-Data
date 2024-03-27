import java.util.Scanner;

public class BukuMain29 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        PencarianBuku29 data = new PencarianBuku29();
        int jmlBuku = 5;

        System.out.println("=====================================");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil: ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("=============================");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = in.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = st.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = in.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = st.nextLine();
            System.out.print("Stok \t \t: ");
            int stock = in.nextInt();

            Buku29 m = new Buku29(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("===============================");
        System.out.println("Data keseluruhan buku: ");
        data.tampil();

        System.out.println("_______________________________");
        System.out.println("_______________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan kode buku yang dicari");
        System.out.print("Kode Buku: ");
        int cari = in.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        Buku29 dataBuku = data.findBuku(cari);
        dataBuku.tampilDataBuku();

        st.close();
        in.close();
    }
}
