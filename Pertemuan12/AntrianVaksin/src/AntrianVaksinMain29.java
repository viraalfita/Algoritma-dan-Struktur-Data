import java.util.Scanner;

public class AntrianVaksinMain29 {
    public static void main(String[] args) throws Exception {
        AntrianVaksin29 antrian = new AntrianVaksin29();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("+-------------------------------+");
                    System.out.println("| Masukkan Data Penerima Vaksin |");
                    System.out.println("+-------------------------------+");
                    System.out.print("Masukkan Nomor Antrian: ");
                    int nomorAntrian = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Penerima: ");
                    String namaPenerima = scanner.nextLine();
                    antrian.addLast(nomorAntrian, namaPenerima);
                    break;
                case 2:
                    antrian.removeFirst();
                    break;
                case 3:
                    antrian.print();
                    System.out.println("Sisa Antrian: " + antrian.size);
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
}