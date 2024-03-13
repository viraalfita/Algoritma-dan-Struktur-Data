import java.util.Scanner;

public class SumMain29 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int perusahaan = scan29.nextInt();
        scan29.nextLine();

        System.out.print("Masukkan jumlah bulan: ");
        int bulan = scan29.nextInt();

        double[][] keuntungan = new double[perusahaan][bulan];

        System.out.println("---------------------------------------");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            for (int j = 0; j < bulan; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + ": ");
                keuntungan[i][j] = scan29.nextDouble();
            }
            scan29.nextLine();
        }

        System.out.println("=======================================");
        System.out.println("Total Keuntungan Setiap Perusahaan: ");
        for (int i = 0; i < perusahaan; i++) {
            Sum29 sum = new Sum29(keuntungan[i]);
            System.out.println(
                    "Total keuntungan perusahaan ke-" + (i + 1) + " selama " + keuntungan[i].length + " bulan adalah = "
                            + sum.TotalBF());
        }

        scan29.close();
    }
}
