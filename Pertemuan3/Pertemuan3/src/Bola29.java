public class Bola29 {
    double jariJari;

    public Bola29(double r) {
        this.jariJari = r;
    }

    public double hitungVolumeBola() {
        double volumeBola = 4 * 3.14 * jariJari * jariJari * jariJari / 3;
        return volumeBola;
    }

    public double hitungLuasBola() {
        double luasBola = 4 * 3.14 * jariJari * jariJari;
        return luasBola;
    }
}
