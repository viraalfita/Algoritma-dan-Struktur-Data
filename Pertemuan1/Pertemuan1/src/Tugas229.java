import java.util.Scanner;

public class Tugas229 {
    static Scanner scan29 = new Scanner(System.in);
    static int pilih = 0;

    public static void main(String[] args) {
        switch (menu()) {
            case 1:
                System.out.println("--- Kecepatan ---");
                hitungKecepatan();
                break;
            case 2:
                System.out.println("--- Jarak ---");
                hitungJarak();
                break;
            case 3:
                System.out.println("--- Waktu ---");
                hitungWaktu();
                break;
            default:
                System.out.println("Menu yang anda masukkan salah!");
                break;
        }
    }

    public static int menu() {
        System.out.println("Menu");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("");
        System.out.print("Pilih: ");
        pilih = scan29.nextInt();
        return pilih;
    }

    public static void hitungKecepatan() {
        System.out.print("Masukkan jarak (m) : ");
        double jarak = scan29.nextDouble();
        System.out.print("Masukkan waktu (s) : ");
        double waktu = scan29.nextDouble();
        System.out.println("Kecepatan : " + jarak / waktu + " m/s");
    }

    public static void hitungJarak() {
        System.out.print("Masukkan kecepatan (m/s) : ");
        double kecepatan = scan29.nextDouble();
        System.out.print("Masukkan waktu (s) : ");
        double waktu = scan29.nextDouble();
        System.out.println("Jarak : " + kecepatan * waktu + " m");
    }

    public static void hitungWaktu() {
        System.out.print("Masukkan jarak (m) : ");
        double jarak = scan29.nextDouble();
        System.out.print("Masukkan kecepatan (m/s) : ");
        double kecepatan = scan29.nextDouble();
        System.out.println("Waktu : " + jarak / kecepatan + " m/s");
    }
}
