// karena ada ketidaksinkronan antara tugas 2 dan perintah pada tugas 3, maka saya berinisiasi untuk 
// mengubah tugas 3 menjadi user lah yang menginputkan jumlah menu dan jumlah minggunya

import java.util.Scanner;

public class Tugas3 {
    static Scanner sc = new Scanner(System.in);

    public static int[][] createArray(){
        System.out.println("================INISIASI UKURAN DATA===============");
        System.out.print(" > Masukkan Jumlah Menu: ");
        int a = sc.nextInt();
        System.out.print(" > Masukkan Jumlah Minggu: ");
        int b = sc.nextInt();
        return new int[a][b];
    }

    public static void input(int[][] data){
        System.out.println("====INPUT DATA PENJUALAN MENU KAFE MARIANA CAFE====");
        for(int i=0;i<data.length;i++){
            System.out.println("Masukkan penjualan menu ke-" + (i + 1));
            for(int j=0;j<data[i].length;j++){
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void output(int[][] data){
        System.out.println("====OUTPUT DATA PENJUALAN MENU KAFE MARIANA CAFE===");
        for(int i=0;i<data[0].length;i++){
            if(i == 0){
                System.out.print("          | ");
            }
            System.out.print("W" + (i + 1) + "| ");
        }
        System.out.println();
        for(int i=0;i<data.length;i++){
            System.out.print("|Menu ke " + (i + 1) + "| ");
            for(int j=0;j<data[i].length;j++){
                System.out.print(data[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("===================================================");
    }

    public static int findHighestMenu(int[][] data){
        int maks = 0;
        int index_maks = 0;
        for(int i=0;i<data.length;i++){
            int total = 0;
            for(int j=0;j<data[i].length;j++){
                total += data[i][j];
            }
            if(total > maks){
                maks = total;
                index_maks = i;
            }
        }
        return index_maks;
    }

    public static int[] findAverage(int[][] data){
        int[] average = new int[data.length];
        for(int i=0;i<data.length;i++){
            int total = 0;
            for(int j=0;j<data[i].length;j++){
                total += data[i][j];
            }
            average[i] = total/data[i].length;
        }
        return average;
    }

    public static void main(String[] args) {

        int dataPenjualan[][] = createArray();
        input(dataPenjualan);
        output(dataPenjualan);
        System.out.println(" > Menu dengan penjualan terbanyak adalah menu ke-" + (findHighestMenu(dataPenjualan) + 1));
        System.out.println("===================================================");
        int[] average = findAverage(dataPenjualan);
        for(int i=0;i<average.length;i++){
            System.out.println(" > Rata-rata penjualan menu ke-" + (i + 1) + " adalah " + average[i]);
        }
    }
}
