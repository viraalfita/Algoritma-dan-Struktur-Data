public class MergeSortMain29 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan merge sort");

        MergeSorting29 ms = new MergeSorting29();
        ms.printArray(data);
        ms.mergeSort(data);
        System.out.println("Setelah diurutkan");
        ms.printArray(data);
    }
}
