// 12000 diganti 14000
// 7000 diganti 6000
// 20000 diganti 18000

package Jobsheet7;
import java.util.Scanner;

public class KafeDoWhile09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 14000;
        double hargaTeh = 6000;
        double hargaRoti = 18000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan");
                break;
            }
            System.out.print("Masukkan jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah roti: ");
            roti = sc.nextInt();
            double total = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar : Rp " + total);
            sc.nextLine();
        } while (true);
        System.out.println("Semua Transaksi Selesai");
        
        sc.close();
    }
}
