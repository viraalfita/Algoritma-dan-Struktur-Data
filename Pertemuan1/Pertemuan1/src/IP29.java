import java.util.Scanner;

public class IP29 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);

        String[] mataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };

        double[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
        double[] nilaiMK = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];

        for (int i = 0; i < bobotNilai.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilaiMK[i] = scan29.nextDouble();

            if (nilaiMK[i] <= 100 && nilaiMK[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiMK[i] <= 80 && nilaiMK[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiMK[i] <= 73 && nilaiMK[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiMK[i] <= 65 && nilaiMK[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiMK[i] <= 60 && nilaiMK[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiMK[i] <= 50 && nilaiMK[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilaiMK[i] < 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            } else {
                System.out.println("Inputan tidak valid!");
            }
        }

        System.out.println("============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("============================");

        System.out.println("MK\t\t\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai");
        System.out.println("Pancasila\t\t\t\t" + nilaiMK[0] + "\t\t\t" + nilaiHuruf[0] + "\t\t\t" + bobotNilai[0]);
        System.out.println(
                "Konsep Teknologi Informasi\t\t" + nilaiMK[1] + "\t\t\t" + nilaiHuruf[1] + "\t\t\t" + bobotNilai[1]);
        System.out.println("Critical Thinking dan Problem Solving\t" + nilaiMK[2] + "\t\t\t" + nilaiHuruf[2] + "\t\t\t"
                + bobotNilai[2]);
        System.out.println("Matematika Dasar\t\t\t" + nilaiMK[3] + "\t\t\t" + nilaiHuruf[3] + "\t\t\t" + bobotNilai[3]);
        System.out.println("Bahasa Inggris\t\t\t\t" + nilaiMK[4] + "\t\t\t" + nilaiHuruf[4] + "\t\t\t" + bobotNilai[4]);
        System.out
                .println("Dasar Pemrograman\t\t\t" + nilaiMK[5] + "\t\t\t" + nilaiHuruf[5] + "\t\t\t" + bobotNilai[5]);
        System.out.println(
                "Praktikum Dasar Pemrograman\t\t" + nilaiMK[6] + "\t\t\t" + nilaiHuruf[6] + "\t\t\t" + bobotNilai[6]);
        System.out.println("Keselamatan dan Kesehatan Kerja\t\t" + nilaiMK[7] + "\t\t\t" + nilaiHuruf[7] + "\t\t\t"
                + bobotNilai[7]);
        System.out.println("==============================");

        double nilaiTotal = 0;
        double totalSks = 0;

        for (int i = 0; i < sks.length; i++) {
            nilaiTotal += (bobotNilai[i] * sks[i]);
            totalSks += sks[i];
        }

        System.out.println("IP : " + (nilaiTotal / totalSks));

        scan29.close();

    }
}
