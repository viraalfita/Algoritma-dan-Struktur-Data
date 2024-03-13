import java.util.Scanner;

public class FaktorialMain29 {
    public static void main(String[] args) {
        Scanner scan20 = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = scan20.nextInt();

        Faktorial29[] fk = new Faktorial29[iJml];

        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial29();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            int iNilai = scan20.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("Hasil - Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println();
        System.out.println("Hasil - Divide and Qonquer");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil perhitungan menggunakan Divide and Qonquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }

        scan20.close();
    }
}