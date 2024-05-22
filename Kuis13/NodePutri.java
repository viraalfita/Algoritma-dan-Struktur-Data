package Kuis13;

public class NodePutri {
    String nama;
    int main, menang, kalah, poin;
    int menang3_0, menang3_1, menang3_2, kalah2_3, kalah1_3, kalah0_3;
    NodePutri next;

    public NodePutri(String nama) {
        this.nama = nama;
        this.main = 0;
        this.menang = 0;
        this.kalah = 0;
        this.poin = 0;
        this.menang3_0 = 0;
        this.menang3_1 = 0;
        this.menang3_2 = 0;
        this.kalah2_3 = 0;
        this.kalah1_3 = 0;
        this.kalah0_3 = 0;
        this.next = null;
    }
}