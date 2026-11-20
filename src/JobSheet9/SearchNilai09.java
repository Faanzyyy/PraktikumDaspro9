// Key 50 + (9 mod 50 = 9) = 59
package JobSheet9;
import java.util.Scanner;
public class SearchNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int jumlah = sc.nextInt();
        
        int [] nilai = new int[jumlah];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + 
            ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.println("Masukkan nilai yang dicari: ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println(
                    "Nilai Ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai Tidak Ditemukan");
        }
    }
}
