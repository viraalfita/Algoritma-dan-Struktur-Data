public class Kerucut29 {
    double jariJari;
    double garisPelukis;

    public Kerucut29(double r, double s) {
        this.jariJari = r;
        this.garisPelukis = s;
    }

    public double hitungLuasKerucut() {
        double luasKerucut = (3.14 * jariJari * garisPelukis) + (3.14 * jariJari * jariJari);
        return luasKerucut;
    }

    public double hitungVolumeKerucut() {
        double tinggi = Math.sqrt(Math.pow(garisPelukis, 2) - Math.pow(jariJari, 2));
        double volumeKerucut = 3.14 * jariJari * jariJari * tinggi / 3;
        return volumeKerucut;
    }

}
