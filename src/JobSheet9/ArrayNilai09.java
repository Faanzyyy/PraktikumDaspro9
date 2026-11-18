// 60 + (9 mod 41 = 9) = 69, P = 9 

package JobSheet9;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        int lulus = 0, tidakLulus = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            lulus++;
        } else {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
            tidakLulus++;
        }
        }

        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        // int i = 1;
        // for (int nilai : nilaiAkhir) {
        //     String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
        //     System.out.println("Nilai akhir mahasiswa " + i + ": "+ nilai + " (" + status + ")");
        //     i++;
        // }
        sc.close();
    }
}
