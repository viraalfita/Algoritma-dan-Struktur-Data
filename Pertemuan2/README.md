# Algoritma dan Struktur Data

<img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="Gambar" style="height: 200px">

<p>Nama     : Vira Alfita Yunia</p>
<p>Kelas    : TI-1B</p>
<p>No       : 29</p>

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
