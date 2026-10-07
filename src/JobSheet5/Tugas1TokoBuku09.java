package JobSheet5;
import java.util.Scanner;

public class Tugas1TokoBuku09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenis;
        int jumlah;
        double diskon;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya) :");
        jenis = sc.nextLine();
        System.out.print("Masukkan jumlah buku :");
        jumlah = sc.nextInt();

        if (jenis.equalsIgnoreCase("kamus") || jenis.equalsIgnoreCase("novel")) {
            if (jenis.equalsIgnoreCase("kamus")) {
                if (jumlah > 3) {
                    diskon = 12 + 2;
                    System.out.println("Diskonnya: " + (int) diskon + "%");
                } else {
                    diskon = 12;     
                    System.out.println("Diskonnya: " + (int) diskon + "%");
                } 
            } 
            else {
                if (jumlah > 4) {
                    diskon = 6 + 2;
                    System.out.println("Diskonnya: " + (int) diskon + "%");
                } else {
                    diskon = 6 + 1;
                    System.out.println("Diskonnya: " + (int) diskon + "%");
                }
            }
        } else {
            if(jumlah > 4) {
                diskon = 4;
                System.out.println("Diskonnya: " + (int) diskon + "%");
            } else {
                diskon = 0;
                System.out.println("Diskonnya: " + (int) diskon + "%");
            }
        }
        System.out.println("Jenis Buku : " +jenis);
        System.out.println("Jumlah Buku : " + jumlah);
    }
}
