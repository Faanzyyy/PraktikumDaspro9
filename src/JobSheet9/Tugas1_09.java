// (5 + (9 mod 11 = 9) = 14)
// (P mod 100 = 9)
package JobSheet9;
import java.util.Scanner;

public class Tugas1_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jmlMhs;
        
        do {
            System.out.print("Masukkan jumlah mahasiswa yang nilainya akan diinput: ");
            jmlMhs = sc.nextInt();
            if (jmlMhs <= 0) {
                System.out.println("Jumlah mahasiswa harus lebih dari 0. Input kembali!");
            }
        } while (jmlMhs <= 0);

        int nilaiMhs [] = new int[jmlMhs];
        int total = 0;
        
        
            for (int i = 0; i < nilaiMhs.length; i++) {
                do {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
                nilaiMhs [i]= sc.nextInt();

                if (nilaiMhs [i] < 0 || nilaiMhs [i] > 100) {
                    System.out.println("Nilai mahasiswa tidak valid. Input kembali!");
                }
                total += nilaiMhs[i];
                } while (nilaiMhs [i] < 0 || nilaiMhs[i] > 100);
            }
            double rata = (double) total / nilaiMhs.length;
            int tertinggi = nilaiMhs[0];
            int terendah = nilaiMhs[0];
            for (int i = 0; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > tertinggi) {
                    tertinggi = nilaiMhs[i];
                }
                if (nilaiMhs[i] < terendah) {
                    terendah = nilaiMhs[i];
                }
            }
            System.out.println("---------- DAFTAR NILAI MAHASISWA ----------");
            for (int i = 0; i < nilaiMhs.length; i++) {
                String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
                System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiMhs[i] + "(" + status + ")");
            }
            System.out.println("---------- REKAP ----------");
            System.out.println("Rata Rata : " + rata);
            System.out.println("Nilai Tertinggi : " + tertinggi);
            System.out.println("Nilai terendah : " + terendah);
    }
}
