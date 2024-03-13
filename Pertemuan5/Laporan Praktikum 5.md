<div align="center">

# Algoritma dan Struktur Data

<img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="Gambar" style="height: 200px">

<p>Vira Alfita Yunia</p>
<p>TI-1B</p>
<p>29</p>
<p>2341720055</p>

</div>

<hr>

## Pertemuan 5 (BRUTE FORCE DAN DIVIDE CONQUER)

### Percobaan 1

<p>Kode program</p>
<img src="gambar/Kode Percobaan 1.png">
<img src="gambar/Kode Percobaan 1(2).png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Percobaan 1.png">

#### Pertanyaan

<strong><p>Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!<p></strong>

<p>if digunakan pada saat nilai elemen = 0, maka direturnkan 1 dikarenakan hasil pangkat 0 sudah pasti 1, sedangkan else digunakan jika nilai tidak sama dengan = 0, maka dilakukan operasi faktorial dari nilai elemen tersebut</p>

<strong><p>Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for? Buktikan!<p></strong>

<p>Bisa saja, di sini saya mengganti dengan perulangan while</p>
<img src="gambar/Modifikasi For.png">

<strong><p>Jelaskan perbedaan antara fakto = i; dan int fakto = n faktorialDC(n-1); !<p></strong>

<p>Penggunaan fakto *= i maka kita menjumlah hasil dari kali semua faktorial berdasarkan index, misalkan = 4! = 4.1 + 4.2 + 4.3</p>
<p>Jika int fakto = n * faktorialDC(n-1); maka kita menghitung faktorial menggunakan fungsi rekursif dan memanggil fungsi itu sendiri sampai kondisi n = 0, misalkan = 4! = 4.3.2.1</p>

### Percobaan 2

<p>Kode program</p>
<img src="gambar/Kode Percobaan 2.png">
<img src="gambar/Kode Percobaan 2(2).png">
<p>Hasil ketika dijalankan</p>
<img src="gambar/Hasil Percobaan 2.png">
