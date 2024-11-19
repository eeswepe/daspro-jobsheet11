public class PengunjungCafe26 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for(String nama: namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void daftarPengunjung(int... idPengunjung) {
        System.out.println("Daftar ID Pengunjung:");
        for(int id: idPengunjung) {
            System.out.println("- " + id);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung(1,2,3);
    }
}
