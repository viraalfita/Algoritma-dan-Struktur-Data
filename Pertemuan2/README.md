<div align="center">

# Algoritma dan Struktur Data

<img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="Gambar" style="height: 200px">

<p>Vira Alfita Yunia</p>
<p>TI-1B</p>
<p>29</p>
<p>2341720055</p>

</div>

## Pertemuan 2 (Object)

### Percobaan 1

<p>Kode program</p>
<img src="gambar/Kode Percobaan 1.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Kode Percobaan 1.png">

#### Pertanyaan

<strong><p>Sebutkan dua karakteristik class atau object!</p></strong>

<p> Mempunyai sesuatu dan Melakukan sesuatu </p>

<strong><p>Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Buku? Sebutkan apa saja atributnya</p></strong>

<ol>
    <li>judul: String</li>
    <li>pengarang: String</li>
    <li>halaman: int</li>
    <li>stok: int</li>
    <li>harga: int</li>
</ol>

<strong><p>Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!</p></strong>

<ol>
    <li>tampilInformasi(): void</li>
    <li>terjual(jml: int): void</li>
    <li>restock(n: int): void</li>
    <li>gantiHarga(hrg: int): int</li>
</ol>

<strong><p>Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!</p></strong>
<img src="gambar/Hasil Modifikasi No 4.png">

<strong><p>Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?</p></strong>

<p>Metode restock(int jml) memiliki satu parameter berupa bilangan integer karena metode ini bertujuan untuk menambah jumlah stok buku yang ada. Parameter jml ini mewakili jumlah buku yang akan ditambahkan ke stok. </p>

### Percobaan 2

<p>Kode program</p>
<img src="gambar/Kode Percobaan 2.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Kode Percobaan 2.png">

#### Pertanyaan

<strong><p>Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!
Apa nama object yang dihasilkan?</p></strong>

<p>bk1</p>

<strong><p>Bagaimana cara mengakses atribut dan method dari suatu objek?</p></strong>

<p>Dengan menambahkan titik di belakang nama object, lalu pilih atribut atau method yang akan diakses</p>

<strong><p>Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?</p></strong>

<p>Karena di output pertama menampilkan sisa stok terakhir sebelum dikurangi oleh pemanggilan method terjual sejumlah 5 buah sehingga di output kedua menampilkan sisa dari stok yaitu 13 - 5 = 8. Selain itu di output pertama atribut harga di set dengan jumlah 71000, lalu diakibatkan pemanggilan method gantiHarga dengan parameter di set ke 60000, harga yang ditampilkan menjadi 60000  </p>

### Percobaan 3

<p>Kode program</p>
<img src="gambar/Kode Percobaan 3 A.png">
<img src="gambar/Kode Percobaan 3 B.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Kode Percobaan 3.png">

#### Pertanyaan

<strong><p>Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!</p></strong>

<img src="gambar/Percobaan 3 Pertanyaan 1.png">

<strong><p>Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?</p></strong>

<p>Kode tersebut dilakukan untuk menginstansiasi object bk2 dengan memasukkan langsung parameter-parameter yang dibutuhkan</p>

<strong><p>Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana
hasilnya? Jelaskan mengapa hasilnya demikian!</p></strong>

<img src="gambar/Hasil Modifikasi No 3.png">
<p>Hasilnya adalah terdapat error pada instansiasi object bk1, hal ini dikarenakan setelah menambahkan konstruktor khusus pada class (public Buku29(String jud, String pg, int hal, int stok, int har)), Java tidak lagi menyediakan secara otomatis konstruktor default tanpa parameter.</p>

<strong><p>Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses
secara berurutan? Jelaskan alasannya!</p></strong>

<p>Pemanggilan method pada class tidak harus diakses secara berurutan. Penggunaan method bisa bergantung pada input dari pengguna, kondisi tertentu, atau tahapan eksekusi program.</p>

<strong><p>Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku!<p></strong>

<img src="gambar/Percobaan 3 Pertanyaan 5.png">
