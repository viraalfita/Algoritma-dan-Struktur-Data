import java.util.Scanner;

public class AngkaMain29 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);
        ProsesAngka29 data = new ProsesAngka29();

        System.out.println("Sebelum diurutkan : ");
        data.tampil();

        System.out.println("\nSetelah diurutkan (ascending): ");
        data.selectionSortAscending();
        data.tampil();

        System.out.println("\nSetelah diurutkan (descending): ");
        data.selectionSortDescending();
        data.tampil();
        System.out.println();

        System.out.print("\nCari Data: ");
        int cari = scan29.nextInt();

        int posisi = data.cariAngka(cari, 0, 16);
        System.out.println("Sebelum diurutkan: ");
        data.tampilPosisi(cari, posisi);

        int posisiAsc = data.cariAngkaAscending(cari, 0, 16);
        System.out.println("Ascending: ");
        data.tampilPosisi(cari, posisiAsc);

        int posisiDesc = data.cariAngkaDescending(cari, 0, 16);
        System.out.println("Descending: ");
        data.tampilPosisi(cari, posisiDesc);

        scan29.close();
    }
}
