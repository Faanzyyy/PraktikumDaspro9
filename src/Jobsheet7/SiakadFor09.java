// 10 diganti 12
// 60 diganti 64

package Jobsheet7;
import java.util.Scanner;

public class SiakadFor09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0,terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 64) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai Tertinggi : " +tertinggi);
        System.out.println("Nilai Terendah : " +terendah);
        System.out.println("Mahasiswa lulus : " +lulus);
        System.out.println("Mahasiswa tidak lulus : " +tidakLulus);
        
        
        sc.close();
    }
}