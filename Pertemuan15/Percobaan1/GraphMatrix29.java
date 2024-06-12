package Pertemuan15.Percobaan1;

public class GraphMatrix29 {
    int vertex;
    int[][] matriks;

    public GraphMatrix29(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int degree(int node) {
        return inDegree(node) + outDegree(node);
    }

    public int outDegree(int asal) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[asal][i] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int inDegree(int asal) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }
}
