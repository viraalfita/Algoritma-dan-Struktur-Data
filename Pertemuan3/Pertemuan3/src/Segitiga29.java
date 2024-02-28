public class Segitiga29 {
    public int alas;
    public int tinggi;

    public Segitiga29(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        int luas = alas * tinggi;
        return luas;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        double keliling = alas + tinggi + sisiMiring;
        return keliling;
    }

}
