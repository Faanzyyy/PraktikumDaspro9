// 50000 diganti 46000 
// 3 tiket , diskon 12%
// 9 tiket , diskon 16%
package Jobsheet7;
import java.util.Scanner;

public class TugasBioskop09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tiket, hargaTiket = 46000, totalTiket = 0;
        double diskon , bayar, totalPenjualan = 0;

        System.out.println("Penjualan tiket bioskop (ketik 0 untuk selesai) ");
        
        do {
            System.out.print("Jumlah tiket yang dibeli pelanggan :");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid, Silahkan coba lagi.");
                continue;
            }
            if (tiket == 0) {
                break;
            }

            double harga = tiket * hargaTiket;
            diskon = 0;
            if (tiket > 9) {
                diskon = 0.16;
            } else if (tiket > 3){
                diskon = 0.12;
            }
            bayar = harga - (harga * diskon);
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total Bayar : Rp " + bayar);

            totalTiket += tiket;
            totalPenjualan += bayar;
        } while (tiket != 0);
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan : " + (long) totalPenjualan);
        sc.close();
    }
}
