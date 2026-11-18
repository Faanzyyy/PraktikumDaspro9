// Percobaan 3 (uji wajib tambahan) salah satu nilai yang diinput 30 + (9 mod 71 = 9) = 39
package JobSheet9;
import java.util.Scanner;

public class ArrayRataNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs[] = new int[10];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Input nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        String predikat = "";
        int lulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            
            if (nilaiMhs[i] > 70) {
                lulus++;
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }

            if (rata2 >= 85) {
                predikat = "SANGAT BAIK";
            } else if (rata2 >= 70){
                predikat = "BAIK";
            } else {
                predikat = "PERLU PENDAMPINGAN";
            }
        }

        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Predikat kelas: " + predikat);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        sc.close();
    }
}
