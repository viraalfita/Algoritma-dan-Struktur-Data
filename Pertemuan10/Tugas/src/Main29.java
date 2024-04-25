package Pertemuan10.Tugas.src;

import java.util.Scanner;

public class Main29 {
    public static void menu() {
        System.out.println("Pilih Menu :");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian paling Depan");
        System.out.println("4. Cek Posisi Paling Belakang");
        System.out.println("5. Cek Posisi Pembeli dalam Antrian");
        System.out.println("6. Daftar Semua Pembeli");
        System.out.println("7. Keluar");
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        Scanner scstr = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue : ");
        int kapasitas = scint.nextInt();
        Queue29 antrian = new Queue29(kapasitas);

        int pilih;
        do {
            menu();
            pilih = scint.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama Pembeli : ");
                    String nama = scstr.nextLine();
                    System.out.print("Masukkan Nomor HP Pembeli : ");
                    int noHP = scint.nextInt();
                    Pembeli29 pembeliBaru = new Pembeli29(nama, noHP);
                    antrian.enqueue(pembeliBaru);
                    break;
                case 2:
                    Pembeli29 pembeliKeluar = antrian.dequeue();
                    if (pembeliKeluar != null) {
                        System.out.println("Pembeli " + pembeliKeluar.nama + " dengan Nomor HP " + pembeliKeluar.noHP
                                + " telah dikeluarkan dari antrian");
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan Nama Pembeli yang ingin dicek posisinya : ");
                    String namaCek = scstr.nextLine();
                    antrian.peekPosition(namaCek);
                    break;
                case 6:
                    antrian.daftarPembeli();
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 7);
        scstr.close();
        scint.close();
    }
}