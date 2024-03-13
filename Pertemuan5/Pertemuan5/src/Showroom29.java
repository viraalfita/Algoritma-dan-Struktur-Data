public class Showroom29 {
    public String merk;
    public String tipe;
    public int tahun;
    public int top_acceleration;
    public int top_power;

    public Showroom29(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public int tertinggiDC(Showroom29[] cars, int l, int r) {
        if (l == r) {
            return cars[l].top_acceleration;
        } else {
            int mid = (l + r) / 2;
            int leftMax = tertinggiDC(cars, l, mid);
            int rightMax = tertinggiDC(cars, mid + 1, r);
            return Math.max(leftMax, rightMax);
        }
    }

    public int terendahDC(Showroom29[] cars, int l, int r) {
        if (l == r) {
            return cars[l].top_acceleration;
        } else {
            int mid = (l + r) / 2;
            int leftMin = terendahDC(cars, l, mid);
            int rightMin = terendahDC(cars, mid + 1, r);
            return Math.min(leftMin, rightMin);
        }
    }

    public double rataRataBF(Showroom29[] cars) {
        int totalPower = 0;
        for (int i = 0; i < cars.length; i++) {
            totalPower += cars[i].top_power;
        }
        return (double) totalPower / cars.length;
    }
}
