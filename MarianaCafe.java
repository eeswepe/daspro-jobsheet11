import java.util.Scanner;

public class MarianaCafe {
    static Scanner sc = new Scanner(System.in);

    public static void input(int[][] data){
        System.out.println("===================================================");
        System.out.println("====INPUT DATA PENJUALAN MENU KAFE MARIANA CAFE====");
        for(int i=0;i<data.length;i++){
            System.out.println("Masukkan penjualan menu ke-" + (i + 1));
            for(int j=0;j<data[i].length;j++){
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println("===================================================");
    }
    
    public static void output(int[][] data){
        System.out.println("===================================================");
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
        int dataPenjualan[][] = new int[5][7];
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
