public class cobamain {
    public static void main(String[] args) {
        coba p = new coba();
        int[] angka = { 2, 4, 3, 5, 1 };

        for (int i = 0; i < angka.length; i++) {
            System.out.print(p);
        }

        for (int i = 0; i < angka.length; i++) {
            p.bubbleSort(angka);
        }

    }
}
