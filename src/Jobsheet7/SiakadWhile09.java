// Kategori nilai huruf (A/B+/B/C+/C/D/E) mengikuti skala penilaian resmi kampus sehingga tidak diubah

package Jobsheet7;
import java.util.Scanner;

public class SiakadWhile09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i = 0;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jml = sc.nextInt();
        
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (1 + i) + ": ");
            nilai = sc.nextInt();
            
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Silahkan masukkan nilai yang valid!");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah A");
                System.out.println("Bagus, Pertahankan Nilainya!");
                
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah E");
            }
            i++;
        }
        
        sc.close();
    }
}