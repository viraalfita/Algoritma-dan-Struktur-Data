package Pertemuan15.Percobaan1;

import java.util.Scanner;

public class GraphMain29 {
    public static void main(String[] args) throws Exception {
        Graph29 gedung = new Graph29(6);
        Scanner scanner = new Scanner(System.in);
        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // GraphMatrix29 gdg = new GraphMatrix29(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
        // System.out.println("");

        System.out.println("+------------------------------------+");
        System.out.println("|        Selamat Datang di           |");
        System.out.println("|          Graph Vira                |");
        System.out.println("+------------------------------------+");
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu Program:");
            System.out.println("+------------------------------------+");
            System.out.println("| a) Add Edge                        |");
            System.out.println("| b) Remove Edge                     |");
            System.out.println("| c) Degree                          |");
            System.out.println("| d) Print Graph                     |");
            System.out.println("| e) Cek Edge                        |");
            System.out.println("| f) Update Jarak                    |");
            System.out.println("| g) Hitung Edge                     |");
            System.out.println("| x) Keluar                          |");
            System.out.println("+------------------------------------+");

            System.out.print("Masukkan pilihan menu: ");
            String menu = scanner.next();

            switch (menu.toLowerCase()) {
                case "a":
                    System.out.print("Masukkan titik asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan titik tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case "b":
                    System.out.print("Masukkan titik asal yang ingin dihapus: ");
                    int asalHapus = scanner.nextInt();
                    System.out.print("Masukkan titik tujuan yang ingin dihapus: ");
                    int tujuanHapus = scanner.nextInt();
                    gedung.removeEdge(asalHapus, tujuanHapus);
                    break;
                case "c":
                    System.out.print("Masukkan titik yang ingin dicek derajatnya: ");
                    int titik = scanner.nextInt();
                    gedung.degree(titik);
                    break;
                case "d":
                    gedung.printGraph();
                    break;
                case "e":
                    gedung.isTetanggaDekat();
                    break;
                case "f":
                    System.out.print("Masukkan titik asal: ");
                    int asalUbah = scanner.nextInt();
                    System.out.print("Masukkan titik tujuan: ");
                    int tujuanUbah = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    int jarakUbah = scanner.nextInt();
                    gedung.updateJarak(asalUbah, tujuanUbah, jarakUbah);
                    break;
                case "g":
                    System.out.print("Jumlah Edge: " + gedung.hitungEdge());
                    break;
                case "x":
                    exit = true;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }

    }

}
