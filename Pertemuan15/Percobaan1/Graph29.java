package Pertemuan15.Percobaan1;

import java.util.Scanner;

public class Graph29 {
    int vertex;
    DoubleLinkedLists29 list[];

    public Graph29(int v) {
        vertex = v;
        list = new DoubleLinkedLists29[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists29();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }

            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalOut + totalIn));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
            }
        }
        System.out.println("");
    }

    public void isTetanggaDekat() throws Exception {
        Scanner scan29 = new Scanner(System.in);
        System.out.print("Masukkan gedung asal: ");
        int asal = scan29.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = scan29.nextInt();

        if (list[asal].size() > 0) {
            for (int i = 0; i < list[asal].size(); i++) {
                int nextNode = list[asal].get(i);
                if (nextNode == tujuan) {
                    System.out
                            .print("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan)
                                    + " Bertetangga");
                } else {
                    System.out
                            .print("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan)
                                    + " Tidak Bertetangga");
                }
            }
        }
    }

    public void updateJarak(int asal, int tujuan, int newJarak) throws Exception {
        boolean updated = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, newJarak);
                updated = true;
                break;
            }
        }
        if (updated) {
            System.out.println("Jarak dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan)
                    + " berhasil diperbarui menjadi " + newJarak + " m");
        } else {
            System.out.println("Edge dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan)
                    + " tidak ditemukan");
        }
    }

    public int hitungEdge() {
        int jmlEdge = 0;
        for (int i = 0; i < vertex; i++) {
            jmlEdge += list[i].size();
        }
        return jmlEdge;
    }

}
