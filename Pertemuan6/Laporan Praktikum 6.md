<div align="center">

# Algoritma dan Struktur Data

<img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="Gambar" style="height: 200px">

<p>Vira Alfita Yunia</p>
<p>TI-1B</p>
<p>29</p>
<p>2341720055</p>

</div>

<hr>

## Pertemuan 6 (Sorting)

### Percobaan Bubble Sort

<p>Kode program</p>
<img src="gambar/Kode Percobaan 1.png">
<img src="gambar/Kode Percobaan 2.png">
<img src="gambar/Kode Percobaan 3.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Percobaan 1.png">

#### Pertanyaan

<strong><p>Terdapat di method apakah proses bubble sort?<p></strong>

<p>Method bubbleSort() pada class DaftarMahasiswaBerprestasi29</p>

<strong><p>Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini, Untuk apakah proses tersebut?<p></strong>

<p>Pertanyaan tersebut menanyakan tentang proses penukaran dua elemen dalam array yang terjadi di dalam method bubbleSort(). Proses ini bertujuan untuk mengurutkan elemen-elemen dalam array berdasarkan nilai ipk dari yang terkecil hingga yang terbesar.</p>

<strong><p>Perhatikan perulangan di dalam bubbleSort() di bawah ini:<p></strong>
<strong><p>a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?</p></strong>

<p>
    Perulangan i: Digunakan untuk mengiterasi setiap elemen dalam array listMhs. Perulangan ini memastikan bahwa semua elemen dibandingkan dengan elemen di sebelahnya.
    Perulangan j: Digunakan untuk mengontrol berapa kali perbandingan dan penukaran elemen dilakukan. Perulangan ini berhenti ketika tidak ada lagi elemen yang perlu ditukar, yaitu ketika array sudah terurut.
</p>

<strong><p>b. Mengapa syarat dari perulangan i adalah i kurang dari listMhs.length-1? </p></strong>

<p>Syarat ini memastikan bahwa perulangan i tidak mengakses elemen di luar array. Elemen terakhir dalam array memiliki indeks listMhs.length-1, sehingga perulangan harus berhenti sebelum mencapai indeks tersebut.</p>

<strong><p>c. Mengapa syarat dari perulangan j adalah j kurang dari listMhs.length-i?</p></strong>

<p>Syarat ini memastikan bahwa perbandingan dan penukaran elemen hanya dilakukan pada elemen-elemen yang belum terurut. Elemen-elemen yang berada di akhir array sudah terurut setelah perulangan sebelumnya, sehingga tidak perlu dibandingkan lagi.</p>

<strong><p>d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?</p></strong>

<p>Perulangan i akan berlangsung sebanyak 50 - 1 = 49 kali.</p>
<p>Jumlah tahap bubble sort tidak dapat ditentukan secara pasti. Tahap bubble sort akan berhenti ketika array sudah terurut. Dalam kasus terburuk, bubble sort membutuhkan listMhs.length - 1 tahap untuk mengurutkan seluruh elemen. Dalam kasus ini, bubble sort membutuhkan 49 tahap untuk mengurutkan seluruh elemen.</p>

### Percobaan Selection Sort

<p>Kode program</p>
<img src="gambar/Kode Selection Sort.png">
<img src="gambar/Kode Selection Sort Main.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Selection Sort.png">

#### Pertanyaaan

<strong><p>Di dalam method selection sort, terdapat baris program seperti di bawah ini:</p></strong>
<strong><p>Untuk apakah proses tersebut, jelaskan!</p></strong>

<p>Kode tersebut merupakan implementasi algoritma selection sort yang digunakan untuk mengurutkan array dari objek Mahasiswa29 berdasarkan nilai IPK mereka. Setiap iterasi dari algoritma ini mencari nilai IPK terkecil dari elemen-elemen yang belum diurutkan, dan kemudian menukar posisi elemen dengan nilai IPK terkecil tersebut dengan elemen pada posisi yang tepat. Hal ini dilakukan dengan cara mengiterasi melalui array, membandingkan nilai IPK setiap elemen, dan memperbarui indeks dengan nilai IPK terkecil yang ditemukan.</p>

### Percobaan Insertion Sort

<p>Kode program</p>
<img src="gambar/Kode Insertion Sort.png">
<img src="gambar/Kode Insertion Sort Main.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Insertion Sort.png">

#### Pertanyaaan

<strong><p>Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.</p></strong>

<p>Kode program</p>
<img src="gambar/Kode Modifikasi.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Modifikasi.png">

### Latihan Praktikum

<strong><p>Sebuah platform travel yang menyediakan layanan pemesanan kebutuhan travelling sedang
mengembangkan backend untuk sistem pemesanan/reservasi akomodasi (penginapan), salah
satu fiturnya adalah menampilkan daftar penginapan yang tersedia berdasarkan pilihan filter
yang diinginkan user. Daftar penginapan ini harus dapat disorting berdasarkan

1. Harga dimulai dari harga termurah ke harga tertinggi.
2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1)
   Buatlah proses sorting data untuk kedua filter tersebut dengan menggunakan algoritma
   bubble sort dan selection sort.</p></strong>

<p>Kode program</p>
<img src="gambar/Hotel.png">
<img src="gambar/Hotel Service.png">
<img src="gambar/Hotel Main.png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Hotel.png">
