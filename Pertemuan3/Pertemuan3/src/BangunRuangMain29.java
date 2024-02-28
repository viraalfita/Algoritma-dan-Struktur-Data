import java.util.Scanner;

public class BangunRuangMain29 {

    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);
        System.out.print("Masukkan jumlah bangun ruang : ");
        int length = scan29.nextInt();
        scan29.nextLine();

        Kerucut29[] kerucut = new Kerucut29[length];

        for (int i = 0; i < length; i++) {
            System.out.println("---- KERUCUT ----");
            System.out.println("Ke-" + (i + 1));
            System.out.print("Masukkan jari-jari         : ");
            double jariJari = scan29.nextDouble();
            System.out.print("Masukkan garis pelukis     : ");
            double garisPelukis = scan29.nextDouble();
            kerucut[i] = new Kerucut29(jariJari, garisPelukis);
            System.out.println();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Volume dan Luas Permukaan Ke-" + i + 1);
            System.out.println("Volume        : " + kerucut[i].hitungVolumeKerucut());
            System.out.println("Luas Permukaan: " + kerucut[i].hitungLuasKerucut());
            System.out.println();
        }

        LimasSegiempat29[] limas = new LimasSegiempat29[length];

        for (int i = 0; i < length; i++) {
            System.out.println("---- LIMAS SEGIEMPAT ----");
            System.out.println("Ke-" + (i + 1));
            System.out.print("Masukkan sisi alas         : ");
            double sisi = scan29.nextDouble();
            System.out.print("Masukkan tinggi limas      : ");
            double tinggiLimas = scan29.nextDouble();
            limas[i] = new LimasSegiempat29(sisi, tinggiLimas);
            System.out.println();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Volume dan Luas Permukaan Ke-" + i + 1);
            System.out.println("Volume        : " + limas[i].hitungVolume());
            System.out.println("Luas Permukaan: " + limas[i].hitungLuasLimas());
            System.out.println();
        }

        Bola29[] bola = new Bola29[length];

        for (int i = 0; i < length; i++) {
            System.out.println("---- BOLA ----");
            System.out.println("Ke-" + (i + 1));
            System.out.print("Masukkan jari-jari         : ");
            double jariJari = scan29.nextDouble();
            bola[i] = new Bola29(jariJari);
            System.out.println();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Volume dan Luas Permukaan Ke-" + i + 1);
            System.out.println("Volume        : " + bola[i].hitungVolumeBola());
            System.out.println("Luas Permukaan: " + bola[i].hitungLuasBola());
            System.out.println();
        }

        scan29.close();
    }
}
