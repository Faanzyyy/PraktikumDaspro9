package JobSheet5;
import java.util.Scanner;

public class nestedUjianSkripsi09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.print("Apakah Mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan Jumlah log bimbingan Pembimbing 1 : ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan Jumlah log bimbingan Pembimbing 2 : ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 10  && bimbinganP2 >= 12 ) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbinganP1 < 10 && bimbinganP2 < 12) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 10 kali dan p2 kurang dari 12 kali";
            } else if (bimbinganP1 < 10) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 10 kali.";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 12 kali";
            } 
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan Kompen.";
        }
        System.out.println(pesan);
    }
}
