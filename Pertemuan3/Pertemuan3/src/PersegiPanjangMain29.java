import java.util.Scanner;

public class PersegiPanjangMain29 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi panjang: ");
        int length = scan29.nextInt();

        PersegiPanjang29[] ppArray29 = new PersegiPanjang29[length];

        for (int i = 0; i < length; i++) {
            ppArray29[i] = new PersegiPanjang29();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang  : ");
            ppArray29[i].panjang = scan29.nextInt();
            System.out.print("Masukkan lebar    : ");
            ppArray29[i].lebar = scan29.nextInt();
            System.out.println();
        }

        for (int i = 0; i < ppArray29.length; i++) {
            System.out.println(
                    "Persegi Panjang ke-" + i + ", panjang: " + ppArray29[i].panjang + ", lebar: "
                            + ppArray29[i].lebar);
        }

        scan29.close();
    }
}
