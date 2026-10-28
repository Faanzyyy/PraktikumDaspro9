// parameter : tarif per  jam kode 1 = 1
// tarif perjam kode 2 = 1
//tarif per jam kode 3 = 1
//banyak jam pertama dikenai harga penuh = 0
// batas syarat diskon (jam) = 0
package UTS;

import java.util.Scanner;

public class SepedaKampus_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kodeSepeda,lamaJam;
        double hargaPenuh,jamBerikutnya,
        totalTarif = 0;
        double diskon = 0.1;
        String statusMahasiswa;
        String namaLayanan = "";
        
        System.out.println("Mahasiswa aktif atau tidak? (ya) : ");
        statusMahasiswa = sc.nextLine();
        System.out.println("Masukkan kode Sepeda (1/2/3): ");
        kodeSepeda = sc.nextInt();
        System.out.println("Lama sewa (1-12 ): ");
        lamaJam = sc.nextInt();

        if (lamaJam <= 12) {
            switch (kodeSepeda) {
            case 1:
                    namaLayanan = "Sepeda Biasa";
                    hargaPenuh = 6000;
                    jamBerikutnya = 3000;

                    if (lamaJam >= 6) {
                        totalTarif = hargaPenuh + (jamBerikutnya * lamaJam) * diskon / 100;
                    } else {
                        totalTarif = hargaPenuh + jamBerikutnya;
                    }

                break;
            case 2 :
                namaLayanan = "Sepeda Listrik";
                hargaPenuh = 13000;
                jamBerikutnya = 7500;

                if (lamaJam >= 6) {
                        totalTarif = hargaPenuh + (jamBerikutnya * lamaJam) * diskon / 100;
                    } else {
                        totalTarif = hargaPenuh + jamBerikutnya;
                    }
                break;
            case 3 :
                namaLayanan = "Sepeda Tandem";
                hargaPenuh = 9000;
                jamBerikutnya = 4500;
                if (lamaJam >= 6) {
                        totalTarif = hargaPenuh + (jamBerikutnya * lamaJam) * diskon / 100;
                    } else {
                        totalTarif = hargaPenuh + jamBerikutnya;
                    }
                break;
            default:
                System.out.println("Kode Tidak Valid.");
                System.exit(0);
                break;
        }
        }else {
            System.out.println("Jam Tidak Valid.");
        }

        

        System.out.println("Layanan: " + namaLayanan);
        System.out.println("Biaya Dasar: " +(int) totalTarif);
        System.out.println("Diskon " + diskon );
        System.out.println("Total Bayar: " + totalTarif);

        sc.close();
    }
}

// Mahasiswa aktif atau tidak? (ya) : 
// ya
// Masukkan kode Sepeda (1/2/3): 
// 1
// Lama sewa (1-12 ): 
// 13
// Jam Tidak Valid.
// Layanan: 
// Biaya Dasar: 0
// Diskon 0.1
// Total Bayar: 0.0