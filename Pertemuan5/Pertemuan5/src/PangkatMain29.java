import java.util.Scanner;

public class PangkatMain29 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);
        System.out.println("======================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = scan29.nextInt();

        Pangkat29[] png = new Pangkat29[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat29();

            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            png[i].nilai = scan29.nextInt();

            System.out.print("Masukkan nilai pemangkat: ");
            png[i].pangkat = scan29.nextInt();
        }

        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilih algoritma yang digunakan: ");
        int pilihan = scan29.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;

            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Inputan salah!");
                break;
        }

        scan29.close();
    }
}
