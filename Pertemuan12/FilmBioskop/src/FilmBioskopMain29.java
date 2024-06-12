package Pertemuan12.FilmBioskop.src;

import java.util.Scanner;

public class FilmBioskopMain29 {
    public static void main(String[] args) throws Exception {
        FilmBioskop29 film = new FilmBioskop29();
        Scanner scan29 = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");
            System.out.println("        DATA FILM LAYAR LEBAR        ");
            System.out.println("=====================================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data pada indeks tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data pada indeks tertentu");
            System.out.println("7. Cetak data");
            System.out.println("8. Cari film berdasarkan ID");
            System.out.println("9. Urutkan data rating film secara descending");
            System.out.println("10. Keluar");
            System.out.println("=====================================");
            System.out.print("Pilihan: ");
            int choice = scan29.nextInt();
            scan29.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film       : ");
                    int idAwal = scan29.nextInt();
                    scan29.nextLine();
                    System.out.print("Judul film    : ");
                    String judulAwal = scan29.nextLine();
                    System.out.print("Rating film   : ");
                    double ratingAwal = scan29.nextDouble();
                    film.addFirst(idAwal, judulAwal, ratingAwal);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film       : ");
                    int idAkhir = scan29.nextInt();
                    scan29.nextLine();
                    System.out.print("Judul film    : ");
                    String judulAkhir = scan29.nextLine();
                    System.out.print("Rating film   : ");
                    double ratingAkhir = scan29.nextDouble();
                    film.addLast(idAkhir, judulAkhir, ratingAkhir);
                    break;
                case 3:
                    System.out.print("Index ke-: ");
                    int idx = scan29.nextInt();
                    scan29.nextLine();
                    System.out.print("ID film       : ");
                    int idIndex = scan29.nextInt();
                    scan29.nextLine();
                    System.out.print("Judul Film    : ");
                    String judulIndex = scan29.nextLine();
                    System.out.print("Rating film   : ");
                    double ratingIndex = scan29.nextDouble();
                    film.add(idIndex, judulIndex, ratingIndex, idx);
                    break;
                case 4:
                    film.removeFirst();
                    break;
                case 5:
                    film.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan indeks: ");
                    int index6 = scan29.nextInt();
                    scan29.nextLine();
                    film.remove(index6);
                    break;
                case 7:
                    film.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID film yang ingin dicari: ");
                    int searchId = scan29.nextInt();
                    Node29 ditemukan = film.cariId(searchId);
                    if (ditemukan != null) {
                        System.out.println("Film ditemukan:");
                        System.out.println("ID: " + ditemukan.idFilm);
                        System.out.println("Judul: " + ditemukan.judulFilm);
                        System.out.println("Rating: " + ditemukan.ratingFilm);
                    } else {
                        System.out.println("Film dengan ID " + searchId + " tidak ditemukan.");
                    }
                    break;
                case 9:
                    film.SortDesc();
                    System.out.println("Data telah diurutkan berdasarkan rating secara descending.");
                    break;
                case 10:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}