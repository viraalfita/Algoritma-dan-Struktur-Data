public class Sum29 {
    double[] profits;

    public Sum29(double[] profits) {
        this.profits = profits;
    }

    double TotalBF() {
        double total = 0;
        for (int i = 0; i < profits.length; i++) {
            total += profits[i];
        }
        return total;
    }
}
