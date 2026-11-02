// WAJIB uji ulang program Anda dengan n = (6 + (9 mod 5 = 4) = 10) 

package Jobsheet8;
import java.util.Scanner;

public class Tugas109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Nilai n harus lebih dari 1.");
        }else {
            int totalTercetak = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    totalTercetak++;
                }
                System.out.println();
            }
            System.out.println("Total angka Tercetak Adalah : " + totalTercetak);
        }
        sc.close();
    }
}
