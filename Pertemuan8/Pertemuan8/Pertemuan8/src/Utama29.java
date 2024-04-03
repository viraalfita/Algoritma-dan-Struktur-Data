import java.util.Scanner;

public class Utama29 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Gudang29 gudang = new Gudang29(5);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
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
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi!");
            }

            if (pilihan == 4) {
                break;
            }
        }
    }
}
