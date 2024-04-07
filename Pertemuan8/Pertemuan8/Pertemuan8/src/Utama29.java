import java.util.Scanner;

public class Utama29 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("---------- Selamat Datang ----------");
        System.out.print("Masukkan jumlah kapasitas barang: ");
        int kapasitas = in.nextInt();

        Gudang29 gudang = new Gudang29(kapasitas);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = in.nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = st.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = st.nextLine();
                    Barang29 barangBaru = new Barang29(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan nama atau kode barang: ");
                    String namaBarang = st.nextLine();
                    gudang.cariBarang(namaBarang);
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi!");
            }

            if (pilihan == 7) {
                break;
            }
        }
    }
}
