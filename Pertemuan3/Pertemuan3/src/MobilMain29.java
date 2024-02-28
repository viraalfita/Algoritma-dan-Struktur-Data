public class MobilMain29 {
    public static void main(String[] args) {
        Mobil29[][] mobil = {
                { new Mobil29(001, "Avanza", "S") },
                { new Mobil29(002, "Brio Satya", "E") },
                { new Mobil29(001, "Pajero", "GLX") },
        };

        System.out.println(mobil[0][0].getMerk());
    }
}
