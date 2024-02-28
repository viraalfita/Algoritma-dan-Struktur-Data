public class LimasSegiempat29 {
    double sisiAlas;
    double tinggiLimas;

    public LimasSegiempat29(double s, double tL) {
        this.sisiAlas = s;
        this.tinggiLimas = tL;
    }

    public double hitungVolume() {
        double volumeLimas = sisiAlas * sisiAlas * tinggiLimas / 3;
        return volumeLimas;
    }

    public double hitungLuasLimas() {
        double tinggiSegitiga = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(sisiAlas / 2, 2));
        double luasLimas = (sisiAlas * sisiAlas) + (4 * (sisiAlas * tinggiSegitiga / 2));
        return luasLimas;
    }

}
