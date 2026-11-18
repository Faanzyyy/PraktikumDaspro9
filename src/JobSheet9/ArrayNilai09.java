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

        for (int i = 0; i < nilaiAkhir.length; i++) {
        String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
        sc.close();
    }
}
