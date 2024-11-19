import java.util.Scanner;

public class Kubus26 {

    public static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi;

        System.out.println("================================================");
        System.out.println("================ Program Kubus =================");
        System.out.println("================================================");
        System.out.print("$ Masukkan panjang sisi kubus ");
        sisi = input.nextInt();
        System.out.println("================================================");
        System.out.println(" > Kubus tersebut memilki luas permukaan " + hitungLuasPermukaan(sisi));
        System.out.println(" > Kubus tersebut memilki volume " + hitungVolume(sisi));
        System.out.println("================================================");

        
    }
}
