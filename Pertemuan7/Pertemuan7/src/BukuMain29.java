import java.util.Scanner;

public class BukuMain29 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        PencarianBuku29 data = new PencarianBuku29();
        int jmlBuku = 3;

        System.out.println("=====================================");
        System.out.println("Masukkan data buku: ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("=============================");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = st.nextLine();
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
        System.out.println("Pencarian Kode Buku: ");
        System.out.println("Masukkan kode buku yang dicari");
        System.out.print("Kode Buku: ");
        String cari = st.nextLine();

        System.out.println("Menggunakan sequential search");
        int posisi1 = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi1);

        System.out.println("Menggunakan binary search");
        int left = 0;
        int right = jmlBuku;
        int posisi2 = data.findBinarySearch(cari, left, right);
        data.tampilPosisi(cari, posisi2);

        data.tampilData(cari, posisi2);

        System.out.println("_______________________________");
        System.out.println("_______________________________");
        System.out.println("Pencarian Judul Buku: ");
        System.out.println("Masukkan kode buku yang dicari");
        System.out.print("Judul Buku: ");
        String cariJudul = st.nextLine();

        System.out.println("Menggunakan sequential search");
        int posisiJudulSeq = data.findSeqSearchJudul(cariJudul);
        System.out.println("seq: " + posisiJudulSeq);
        data.tampilPosisi(cariJudul, posisiJudulSeq);

        System.out.println("Menggunakan binary search");
        int posisiJudulBin = data.findBinarySearchJudul(cariJudul, left, right);
        System.out.println("bin: " + posisiJudulBin);
        data.tampilPosisi(cariJudul, posisiJudulBin);

        data.tampilDataJudul(cariJudul, posisiJudulSeq);

        // Buku29 dataBuku = data.findBuku(cari);
        // dataBuku.tampilDataBuku();

        st.close();
        in.close();
    }
}
