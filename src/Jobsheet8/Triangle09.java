// Simpan dan jalankan program dengan n = (2 + (9 mod 3) = 2) sesuai parameter unik Anda,
// kemudian dengan n = 5. Catat output aktual yang muncul, lalu bandingkan dengan output
// target.

package Jobsheet8;

import java.util.Scanner;

public class Triangle09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.print("[i=" + i + "] "); //debug sementara
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}