package kuis;
import java.util.Scanner;

public class Nilaimhs09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa;
        String namaMahasiswa = " ";
        String tambah = " ";
        String status = "Tidak Lulus";
        int kuis, uts, uas, jmlTugas = 2, jumlahLulus, nilaiAkhir, rata;

        do {
            System.out.print("Masukkan nama mahasiswa : ");
            namaMahasiswa = sc.nextLine();
            System.out.print("Masukkan nilai Kuis : ");
            kuis = sc.nextInt();
            System.out.print("Masukkan nilai UTS : ");
            uts = sc.nextInt();
            System.out.print("Masukkan nilai UAS : ");
            uas = sc.nextInt();
            for (int i = 1; i <= 2; i++) {
                do {
                    System.out.print(" Nilai jmlTugas " + i + ": ");
                        jmlTugas = sc.nextInt();
                        if (jmlTugas < 0 || jmlTugas > 100) {
                            System.out.println("Nilai harus 0-100. Ulangi input!");
                        }
                } while (jmlTugas < 0 || jmlTugas > 100);
            }
            rata = kuis + uts + uas + jmlTugas / 4;
            
        sc.nextLine();
        System.out.print("Apakah ingin menambah mahasiswa (Ya/Tidak) : ");
        tambah = sc.nextLine();
        } while (tambah.equalsIgnoreCase("Ya"));
        
        sc.close();
    }
}
