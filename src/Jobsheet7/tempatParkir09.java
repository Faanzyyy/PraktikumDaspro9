// parkir mobil = 3200
// parkir motor = 2200

package Jobsheet7;
import java.util.Scanner;

public class tempatParkir09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

       do {
        System.out.print("Jenis (1 Mobil, 2 Motor, 0 Keluar) : ");
        jenis = sc.nextInt();
        if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi (jam) : ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3200;
                } else {
                    total += durasi * 2200;   
                }
            }
       } while (jenis != 0);
         System.out.println("Total Bayar : Rp " + total);  
        sc.close();
    }
}
