import java.util.Scanner;

public class Kafe26 {
    static Scanner sc = new Scanner(System.in);
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if(kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30% untuk setiap pembelian!");
        }else if(kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50% untuk setiap pembelian!");
        }else{
            System.out.println("Kode promo tidak valid.");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam Rp 15,000");
        System.out.println("2. Cappuccino Rp 20,000");
        System.out.println("3. Latte Rp 22,000");
        System.out.println("4. Teh Tarik Rp 12,000");
        System.out.println("5. Roti Bakar Rp 10,000");
        System.out.println("6. Mie Goreng Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems [pilihanMenu-1] * banyakItem;

        if(kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%");
            hargaTotal *= 0.7;
        }else if(kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%");
            hargaTotal *= 0.5;
        }else{
            System.out.println("Kode promo tidak valid.");
            System.out.println("Anda tidak mendapatkan diskon");
        }

        return hargaTotal;
    }

    public static int banyakMenu(){
        int totalBayar = 0;
        while(true){
            System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            if(pilihanMenu < 1 || pilihanMenu > 6){
                System.out.println("Menu tidak tersedia.");
                continue;
            }
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan kode promo:");
            String kodePromo = sc.nextLine();
            totalBayar += hitungTotalHarga (pilihanMenu, banyakItem, kodePromo);
            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            char lanjut = sc.next().charAt(0);
            if(lanjut == 'n'){
                break;
            }
        }
        return totalBayar;
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON30");
        int totalBayar = banyakMenu();
        System.out.println("Total bayar: " + totalBayar);
    }

}