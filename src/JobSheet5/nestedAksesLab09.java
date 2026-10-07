package JobSheet5;
import java.util.Scanner;
public class nestedAksesLab09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah anda Mahasiswa Aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah anda sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah anda punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah anda asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();
        
        if (mahasiswaAktif && !sedangDisanksi ) {
            if (punyaIzinDosen || asistenLab){
                System.out.println("Akses Laboratorium Diberikan.");
            } else {
                System.out.println("Akses Ditolak: Membutuhkan izin dosen atau asisten Lab.");
            }
        } else {
            System.out.println("Akses Ditolak: Status mahasiswa tidak memenuhi syarat.");
        }
    }
}
