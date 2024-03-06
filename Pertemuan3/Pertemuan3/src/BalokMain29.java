public class BalokMain29 {
    public static void main(String[] args) {
        Balok29[] blArray = new Balok29[3];

        blArray[0] = new Balok29(100, 30, 12);
        blArray[1] = new Balok29(120, 40, 15);
        blArray[2] = new Balok29(210, 50, 25);

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume Balok ke-" + i + ": " + blArray[i].hitungVolume());
        }

    }
}
