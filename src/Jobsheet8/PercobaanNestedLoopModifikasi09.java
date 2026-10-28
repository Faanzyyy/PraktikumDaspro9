package Jobsheet8;
import java.util.Scanner;

public class PercobaanNestedLoopModifikasi09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahTerjual,totalPerProduk = 0, totalPenjualan = 0, jumlahProduk = 3, jumlahHari = 4;

        for (int i = 0; i < jumlahHari; i++) {
            for (int j = 0; j < jumlahProduk; j++) {
                System.out.print("Masukkan Produk " + (j+1) + " Hari Ke " + (i+1) + " : ");
                jumlahTerjual = sc.nextInt();
                totalPerProduk += jumlahTerjual;
                
                System.out.println("Hasil hari ke " + (i+1) + " Produk ke " + (j+1) + " = " + totalPerProduk);  
            }
            System.out.println("Total Terjual Per Harinya "+ (i+1) + " = " + totalPerProduk);
            totalPenjualan += totalPerProduk;
            totalPerProduk = 0;
        }
        System.out.println("Total Penjualan = " + totalPenjualan);
        sc.close();
    }
}