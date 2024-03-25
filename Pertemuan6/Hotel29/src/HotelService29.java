public class HotelService29 {
    Hotel29 rooms[] = new Hotel29[5];
    int idx;

    void tambah(Hotel29 h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll() {
        for (Hotel29 h : rooms) {
            h.tampil();
            System.out.println("-------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    // swap
                    Hotel29 temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }

            // swap
            Hotel29 temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }

}
