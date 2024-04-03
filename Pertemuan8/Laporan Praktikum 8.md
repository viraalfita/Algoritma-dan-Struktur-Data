<div align="center">

# Algoritma dan Struktur Data

<img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="Gambar" style="height: 200px">

<p>Vira Alfita Yunia</p>
<p>TI-1B</p>
<p>29</p>
<p>2341720055</p>

</div>

<hr>

## Pertemuan 8 (Stack)

### Percobaan Bubble Sort

<p>Kode program</p>
<p>Barang29.java</p>

    public class Barang29 {
        int kode;
        String nama, kategori;

        public Barang29(int kode, String nama, String kategori) {
            this.kode = kode;
            this.nama = nama;
            this.kategori = kategori;
        }

    }

<p>Gudang29.java<p>

    public class Gudang29 {
    Barang29[] tumpukan;
    int size, top;

        public Gudang29(int kapasitas) {
            size = kapasitas;
            tumpukan = new Barang29[size];
            top = -1;
        }

        public boolean cekKosong() {
            if (top == -1) {
                return true;
            } else {
                return false;
            }
        }

        public boolean cekPenuh() {
            if (top == size - 1) {
                return true;
            } else {
                return false;
            }
        }

        public void tambahBarang(Barang29 brg) {
            if (!cekPenuh()) {
                top++;
                tumpukan[top] = brg;
                System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
            } else {
                System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
            }
        }

        public Barang29 ambilBarang() {
            if (!cekKosong()) {
                Barang29 delete = tumpukan[top];
                top--;
                System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
                return delete;
            } else {
                System.out.println("Tumpukan barang kosong.");
                return null;
            }
        }

        public Barang29 lihatBarangTeratas() {
            if (!cekKosong()) {
                Barang29 barangTeratas = tumpukan[top];
                System.out.println("Barang teratas: " + barangTeratas.nama);
                return barangTeratas;
            } else {
                System.out.println("Tumpukan barang kosong.");
                return null;
            }
        }

        public void tampilkanBarang() {
            if (!cekKosong()) {
                System.out.println("Rincian tumpukan barang di Gudang: ");
                for (int i = top; i >= 0; i--) {
                    System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                            tumpukan[i].kategori);
                }
            } else {
                System.out.println("Tumpukan barang kosong.");
            }
        }

    }

<p>Utama29.java<p>

    import java.util.Scanner;

    public class Utama29 {
    public static void main(String[] args) {
    Scanner st = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    Gudang29 gudang = new Gudang29(5);

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah barang");
                System.out.println("2. Ambil barang");
                System.out.println("3. Tampilkan tumpukan barang");
                System.out.println("4. Keluar");
                System.out.print("Pilih Operasi: ");
                int pilihan = in.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan kode barang: ");
                        int kode = in.nextInt();
                        System.out.print("Masukkan nama barang: ");
                        String nama = st.nextLine();
                        System.out.print("Masukkan nama kategori: ");
                        String kategori = st.nextLine();
                        Barang29 barangBaru = new Barang29(kode, nama, kategori);
                        gudang.tambahBarang(barangBaru);
                        break;
                    case 2:
                        gudang.ambilBarang();
                        break;
                    case 3:
                        gudang.tampilkanBarang();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silahkan coba lagi!");
                }

                if (pilihan == 4) {
                    break;
                }
            }
        }

    }

<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Percobaan 1.png">

#### Pertanyaan

<strong><p>Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi shasil percobaan! Bagian mana saja yang perlu diperbaiki?<p></strong>

<img src="gambar/Error1.png">
<p>Error pada gambar tersebut yaitu sebelumnya nama method ditulis dengan isEmpty sehingga program tidak bisa mendeteksi ada sebuah method bernama isEmpty, dan pemanggilan method yang benar yaitu cekKosong.</p>
<img src="gambar/Error2.png">
<p>Error pada gambar tersebut yaitu sebelumnya perulangan dilakukan dengan mengambil data paling bawah terlebih dahulu, dikarenakan kita menggunakan metode stack, maka seharusnya perulangan dilakukan dengan mengambil data paling atas terlebih dahulu.</p>
<img src="gambar/Error3.png">
<p>Error pada gambar tersebut yaitu sebelumnya tidak ada penambahan kondisi untuk program bisa keluar dari perulangan tersebut, jika user memilih opsi untuk keluar, program tidak dapat keluar dari perulangan. Maka dari itu kita perlu menambahkan kondisi agar program bisa berhenti ketika user memilih opsi keluar.</p>

<strong><p>Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya?<p></strong>

<p>Pengecekan kondisi !cekKosong() perlu dilakukan untuk memvalidasi apakah stack yang didalamnya terdapat data atau tidak, jika kondisi tersebut dihapus maka tidak terjadi error.</p>

<strong><p>Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!<p></strong>

<p>Kode Program</p>
<img src="gambar/Kode Modifikasi 1.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Modifikasi 1.png">
