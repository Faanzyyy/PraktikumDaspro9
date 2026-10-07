package JobSheet6;
import java.util.Scanner;

public class StudiKasus2_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int jumlahDok, peringkat, statusPKM, kurang;

        System.out.print("Nama Mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenis = sc.nextLine();

        if(jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") 
            || jenis.equalsIgnoreCase("MANDIRI")) {
                System.out.print("Jumlah Dokumen: ");
                jumlahDok = sc.nextInt();
                System.out.print("Peringkat: ");
                peringkat = sc.nextInt();

                if (peringkat >= 1 && peringkat <= 3) {
                    if (jumlahDok == 4) {
                        System.out.println("Status: Berhak memperoleh dana penghargaan (juara " + peringkat + ").");
                    }else {
                        kurang = 4 - jumlahDok;
                        System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana Penghargaan Tidak Diberikan.");
                    }
                }else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan.");
                }
            } 
    }
}
