package JobSheet5;
import java.util.Scanner;
public class Tugas2SeleksiAsisten09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String statusAktif, sanksiAkademik, sertifikat;
        int nilaiDaspro, nilaiWawancara;

        int minimalNilaiDaspro = 84;
        int minimalNilaiWawancara = 79;

        System.out.print("Status Aktif Kuliah? (ya/tidak):  ");
        statusAktif = sc.nextLine();
        System.out.print("Sedang Sanksi Akademik? (ya/tidak): ");
        sanksiAkademik = sc.nextLine();    
        System.out.print("Nilai Dasar Pemrograman: ");
        nilaiDaspro = sc.nextInt(); 
        sc.nextLine();  
        System.out.print("Ada Sertifikat? (ya/tidak): ");
        sertifikat = sc.nextLine();                             

        if(statusAktif.equalsIgnoreCase("ya") && sanksiAkademik.equalsIgnoreCase("tidak")) {
            if (nilaiDaspro >= minimalNilaiDaspro || sertifikat.equalsIgnoreCase("ya")) {
                System.out.print("Nilai Wawancara: ");
                nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= minimalNilaiWawancara) {
                    System.out.println("Hasil: Diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Hasil: Gagal sebagai asisten praktikum");
                    System.out.println("Alasan: Karena nilai wawancara " + nilaiWawancara + " kurang dari " + minimalNilaiWawancara);
                }
            } else {
                System.out.println("Hasil: Gagal sebagai asisten praktikum");
                System.out.println("Alasan: karena nilai dasar pemrograman " + nilaiDaspro + " kurang dari " + minimalNilaiDaspro + " dan tidak memiliki sertifikat");
            }
        } else {
            System.out.println("Hasil: Gagal sebagai asisten praktikum");
            if(!statusAktif.equalsIgnoreCase("ya") && !sanksiAkademik.equalsIgnoreCase("tidak")) {
                System.out.println("Alasan: Status mahasiswa sedang tidak aktif dan terkena sanksi akademik");
            } else if(!statusAktif.equalsIgnoreCase("ya")) {
                System.out.println("Alasan: Status mahasiswa tidak aktif");
            } else {
                System.out.println("Alasan: Mahasiswa terkena sanksi akademik");
            }
        }
    }
}