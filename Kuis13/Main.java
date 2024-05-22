package Kuis13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LigaPutra ligaPutra = new LigaPutra();
        LigaPutri ligaPutri = new LigaPutri();

        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("+----------------------------------------------------+");
            System.out.println(
                    "| \u001B[33m  SELAMAT DATANG DI PROLIGA VOLI INDONESIA 2024  \u001B[0m  |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| No | Liga                                          |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| 1  | Liga Putra                                    |");
            System.out.println("| 2  | Liga Putri                                    |");
            System.out.println("| 3  | Keluar                                        |");
            System.out.println("+----------------------------------------------------+");

            System.out.print("Pilih liga: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            boolean end = false;

            switch (pilihan) {
                case 1:
                    while (end == false) {
                        System.out.println("+----------------------------------------------------+");
                        System.out.println("|   \u001B[33m           Proliga Voli Putra 2024           \u001B[0m    |");
                        System.out.println("+----------------------------------------------------+");
                        System.out.println("| No | Menu                                          |");
                        System.out.println("+----------------------------------------------------+");
                        System.out.println("| 1  | Tambah Tim                                    |");
                        System.out.println("| 2  | Lihat Tim                                     |");
                        System.out.println("| 3  | Catat Pertandingan                            |");
                        System.out.println("| 4  | Tampilkan Klasemen                            |");
                        System.out.println("| 5  | Keluar                                        |");
                        System.out.println("+----------------------------------------------------+");

                        System.out.print("Pilih menu: ");
                        int pilih1 = scanner.nextInt();
                        scanner.nextLine();

                        switch (pilih1) {
                            case 1:
                                System.out.print("Masukkan nama tim: ");
                                String namaTim = scanner.nextLine();
                                ligaPutra.tambahTim(namaTim);
                                break;
                            case 2:
                                ligaPutra.tampilkanTim();
                                break;
                            case 3:
                                System.out.print("Masukkan nama tim 1: ");
                                String tim1 = scanner.nextLine();
                                System.out.print("Masukkan nama tim 2: ");
                                String tim2 = scanner.nextLine();
                                System.out.print("Masukkan nama tim pemenang: ");
                                String pemenang = scanner.nextLine();
                                System.out.print("Masukkan skor: ");
                                String skor = scanner.nextLine();
                                ligaPutra.catatPertandingan(tim1, tim2, pemenang, skor);
                                break;
                            case 4:
                                ligaPutra.tampilkanKlasemen();
                                break;
                            case 5:
                                end = true;
                                break;
                            default:
                                System.out.println("Menu tidak valid.");
                        }
                    }
                    break;
                case 2:
                    while (end == false) {
                        System.out.println("+----------------------------------------------------+");
                        System.out.println("|   \u001B[33m           Proliga Voli Putri 2024           \u001B[0m    |");
                        System.out.println("+----------------------------------------------------+");
                        System.out.println("| No | Menu                                          |");
                        System.out.println("+----------------------------------------------------+");
                        System.out.println("| 1  | Tambah Tim                                    |");
                        System.out.println("| 2  | Lihat Tim                                     |");
                        System.out.println("| 3  | Catat Pertandingan                            |");
                        System.out.println("| 4  | Tampilkan Klasemen                            |");
                        System.out.println("| 5  | Keluar                                        |");
                        System.out.println("+----------------------------------------------------+");

                        System.out.print("Pilih menu: ");
                        int pilih2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (pilih2) {
                            case 1:
                                System.out.print("Masukkan nama tim: ");
                                String namaTim = scanner.nextLine();
                                ligaPutri.tambahTim(namaTim);
                                break;
                            case 2:
                                ligaPutri.tampilkanTim();
                                break;
                            case 3:
                                System.out.print("Masukkan nama tim 1: ");
                                String tim1 = scanner.nextLine();
                                System.out.print("Masukkan nama tim 2: ");
                                String tim2 = scanner.nextLine();
                                System.out.print("Masukkan nama tim pemenang: ");
                                String pemenang = scanner.nextLine();
                                System.out.print("Masukkan skor: ");
                                String skor = scanner.nextLine();
                                ligaPutri.catatPertandingan(tim1, tim2, pemenang, skor);
                                break;
                            case 4:
                                ligaPutri.tampilkanKlasemen();
                                break;
                            case 5:
                                end = true;
                                break;
                            default:
                                System.out.println("Menu tidak valid.");
                        }
                    }
                    break;
                case 3:
                    berjalan = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
        scanner.close();
    }
}
