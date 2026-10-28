// Jalankan kembali program dengan n = (3 + 9 % 5 = 7) dan n = (9 + 9 % 5 = 13), dengan P
// adalah nomor absen Anda (lihat Ketentuan Parameter Unik). Catat jumlah karakter *
// yang muncul pada setiap pengujian

package Jobsheet8;
import java.util.Scanner;

public class Star09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
