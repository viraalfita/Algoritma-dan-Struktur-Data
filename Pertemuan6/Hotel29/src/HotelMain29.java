import java.util.Scanner;

public class HotelMain29 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);
        HotelService29 list = new HotelService29();

        Hotel29 h1 = new Hotel29("Hotel Mawar", "Malang", 100000, (byte) 1);
        Hotel29 h2 = new Hotel29("Hotel Srikandi", "Nganjuk", 200000, (byte) 3);
        Hotel29 h3 = new Hotel29("Hotel Melati", "Blitar", 300000, (byte) 4);
        Hotel29 h4 = new Hotel29("Hotel Tychi", "Malang", 350000, (byte) 3);
        Hotel29 h5 = new Hotel29("Hotel Savana", "Surabaya", 500000, (byte) 5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("------------ HOTEL ------------");
        list.tampilAll();
        System.out.println();
        System.out.println("1. Filter berdasarkan harga terendah");
        System.out.println("2. Filter berdasarkan bintang tertinggi");
        System.out.print("Filter: ");
        int filter = scan29.nextInt();
        System.out.println();

        if (filter == 1) {
            System.out.println("Filter berdasarkan harga terendah: ");
            list.bubbleSort();
            list.tampilAll();
            System.out.println();
        } else if (filter == 2) {
            System.out.println("Filter berdasarkan bintang tertinggi: ");
            list.selectionSort();
            list.tampilAll();
            System.out.println();
        } else {
            System.out.println("Inputan tidak valid!");
        }

        scan29.close();
    }
}
