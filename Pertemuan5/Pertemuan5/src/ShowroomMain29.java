public class ShowroomMain29 {
    public static void main(String[] args) {
        Showroom29[] mobil = {
                new Showroom29("BMW", "M2 Coupe", 2016, 6816, 728),
                new Showroom29("Ford", "Fiesta ST", 2014, 3921, 575),
                new Showroom29("Nissan", "370Z", 2009, 4360, 657),
                new Showroom29("Subaru", "BRZ", 2014, 4058, 609),
                new Showroom29("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Showroom29("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Showroom29("Toyota", "86/GT86", 2014, 4180, 609),
                new Showroom29("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        // Membuat objek dari kelas Showroom29
        Showroom29 showroom = new Showroom29("Merk", "Tipe", 2022, 0, 0);

        // Mengakses method tertinggiDC() dan terendahDC()
        int tertinggi = showroom.tertinggiDC(mobil, 0, mobil.length - 1);
        int terendah = showroom.terendahDC(mobil, 0, mobil.length - 1);
        double rataRata = showroom.rataRataBF(mobil);

        // Menampilkan hasil
        System.out.println("Top acceleration tertinggi: " + tertinggi);
        System.out.println("Top acceleration terendah: " + terendah);
        System.out.println("Rata-rata acceleration: " + rataRata);
    }
}
