import java.util.Scanner;

public class MahasiswaMain29 {
    public static void main(String[] args) {
        Scanner scanint = new Scanner(System.in);
        Scanner scandb = new Scanner(System.in);
        Scanner scanstr = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int length = scanint.nextInt();
        scandb.nextLine();

        Mahasiswa29[] mhs = new Mahasiswa29[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Masukkan data mahasiswa ke " + (i + 1));
            System.out.print("Masukkan NIM          : ");
            int nim = scanint.nextInt();
            System.out.print("Masukkan Nama         : ");
            String nama = scanstr.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            String jenisKelamin = scanstr.nextLine();
            System.out.print("Masukkan IPK          : ");
            double ipk = scandb.nextDouble();
            System.out.println();
            mhs[i] = new Mahasiswa29(nim, nama, jenisKelamin, ipk);
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM          : " + mhs[i].nim);
            System.out.println("Nama         : " + mhs[i].nama);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("IPK          : " + mhs[i].ipk);
            System.out.println();
        }

        double totalIPK = 0;
        for (int i = 0; i < mhs.length; i++) {
            totalIPK += mhs[i].ipk;
        }

        double rerata = totalIPK / length;
        System.out.println("Rata-rata IPK : " + rerata);

        Mahasiswa29 mahasiswaTerbaik = mhs[0];
        for (int i = 1; i < length; i++) {
            if (mhs[i].ipk > mahasiswaTerbaik.ipk) {
                mahasiswaTerbaik = mhs[i];
            }
        }

        System.out.println("Data Mahasiswa dengan IPK Tertinggi:");
        System.out.println("NIM          : " + mahasiswaTerbaik.nim);
        System.out.println("Nama         : " + mahasiswaTerbaik.nama);
        System.out.println("Jenis Kelamin: " + mahasiswaTerbaik.jenisKelamin);
        System.out.println("IPK          : " + mahasiswaTerbaik.ipk);

        scandb.close();
        scanint.close();
        scanstr.close();

    }
}
