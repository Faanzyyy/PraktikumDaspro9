package JobSheet6;
import java.util.Scanner;
// hargaPerCup = 15000 + (P mod 6) × 1000 → gantikan Rp18.000 pada flowchart = 15000 + 3 x 1000 = Rp18.000
// Syarat minimal belanja untuk diskon = 80000 + (P mod 5) × 10000 → gantikan Rp100.000 pada flowchart = 80000 + 4 x 10000 = Rp120.000
//Persentase diskon = 5 + (P mod 6) % → gantikan 10% pada flowchart = 5 + 3 = 8%
//Struktur logika (urutan langkah pada flowchart) tetap sama, hanya ketiga angka di atas yang diganti
//sesuai P Anda.
import java.util.Scanner;
 public class StudiKasus1_09 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup:");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar:");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 120000) {
            diskon = totalHarga * 8 / 100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup kurang Rp." +kurang);
        }
    }
 }