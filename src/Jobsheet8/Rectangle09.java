// (baris, kolom) = (2 + (9 mod 3 = 2), 4 + (9 mod 3) = 4) dan 
// (5 + (9 mod 3 = 5) , 2 + (9 mod 3 = 2)) sesuai parameter unik Anda

package Jobsheet8;
import java.util.Scanner;

public class Rectangle09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan Jumlah Kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= kolom ; i++) {  // ini OuterLoopnya
            for (int j = 1; j <= baris; j++) { // ini InnerLoopnya
                System.out.print("#");
            }
            System.out.println(); 
        }
        sc.close();
    }
}
