public class coba {
    void bubbleSort(int[] angka) {
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 1; j < angka.length - i; j++) {
                if (angka[j] > angka[j - 1]) {
                    // swap
                    int temp = angka[j];
                    angka[j] = angka[j - 1];
                    angka[j - 1] = temp;
                }
            }
        }
        System.out.println(angka);
    }
}
