public class Segitiga29Main {
    public static void main(String[] args) {
        Segitiga29[] segitiga = new Segitiga29[4];

        // segitiga[0] = new Segitiga29(10, 4);
        // segitiga[1] = new Segitiga29(20, 10);
        // segitiga[2] = new Segitiga29(15, 6);
        // segitiga[3] = new Segitiga29(25, 10);

        for (int i = 0; i < segitiga.length; i++) {
            segitiga[i] = new Segitiga29(10, 4);
        }

        for (int i = 0; i < segitiga.length; i++) {
            System.out.println("Segitiga Ke-" + i);
            System.out.println("Alas    : " + segitiga[i].alas);
            System.out.println("Tinggi  : " + segitiga[i].tinggi);
            System.out.println("Luas    : " + segitiga[i].hitungLuas());
            System.out.println("Keliling: " + segitiga[i].hitungKeliling());
            System.out.println();
        }
    }
}
