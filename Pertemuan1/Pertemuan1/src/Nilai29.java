import java.util.Scanner;

public class Nilai29 {
    public static void main(String[] args) throws Exception {
        Scanner scan29 = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas : ");
        double nilaiTugas = scan29.nextDouble();
        System.out.print("Masukkan nilai kuis : ");
        double nilaiKuis = scan29.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        double nilaiUTS = scan29.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double nilaiUAS = scan29.nextDouble();
        System.out.println();

        if (isNilaiValid(nilaiTugas) && isNilaiValid(nilaiKuis) && isNilaiValid(nilaiUTS) && isNilaiValid(nilaiUAS)) {
            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

            System.out.println("Nilai akhir : " + nilaiAkhir);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("Nilai Huruf : A");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai Huruf : B+");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai Huruf : B");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai Huruf : C+");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai Huruf : C");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai Huruf : D");
                System.out.println("ANDA TIDAK LULUS!");
            } else if (nilaiAkhir <= 39) {
                System.out.println("Nilai Huruf : E");
                System.out.println("ANDA TIDAK LULUS!");
            }
        } else {
            System.out.println("Nilai anda tidak valid");
        }

        scan29.close();

    }

    public static boolean isNilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

}
