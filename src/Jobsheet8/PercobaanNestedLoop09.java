package Jobsheet8;
import java.util.Scanner;

public class PercobaanNestedLoop09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahTerjual,totalPerProduk = 0, totalPenjualan = 0, jumlahProduk = 3, jumlahHari = 4;

        for (int i = 0; i < jumlahProduk; i++) {
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Masukkan Jumlah Terjual " + "Produk ke " + (i+1) + " Hari Ke " + (j+1) + " : ");
                jumlahTerjual = sc.nextInt();
                totalPerProduk += jumlahTerjual;
            }
            System.out.println("Total Terjual Produk "+ (i+1) + ":" + totalPerProduk);
            totalPenjualan += totalPerProduk;
            totalPerProduk = 0;
        }
        System.out.println("Total Penjualan = " + totalPenjualan);
        sc.close();
    }
}