//jumlah item dipesam 2 + (6 mod 4 = 2) = 4
//indeks menu yang wajib dipesan 9 mod 7 = 2
package JobSheet9;
import java.util.Scanner;

public class Tugas2_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                            "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int [] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== Daftar Menu Kafe Kampus =====");
        System.out.printf("%-4s %-18s %10s%n", "No", "Menu", "Harga");
        System.out.println("-----------------------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-4d %-18s Rp%,8d%n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("===================================");

        System.out.println("\n--- Pencarian Menu ---");
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = sc.nextLine();

        
        int hasilPencarian = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari.trim())) {
                hasilPencarian = i;
                break;
            }
        }
        if (hasilPencarian != -1) {
            System.out.printf("Menu ditemukan: %s, harga Rp%,d%n", menu[hasilPencarian], harga[hasilPencarian]);
        } else {
            System.out.println("Maaf, menu \""+ cari + "\" tidak tersedia.");
        }
        System.out.println("\n--- Pemesanan ---");
        int jumlah;
        do {
            System.out.print("Jumlah item yang ingin dipesan: ");
            jumlah = sc.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0.");
            }
        } while (jumlah <= 0);
        sc.nextLine();

        String pesanan[] = new String[jumlah];
        int hargaPesanan[] = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int idx;
            do {
                System.out.print("Item ke-" + (i + 1) + "(nama menu):");
                String inputMenu = sc.nextLine();

                idx = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(inputMenu.trim())) {
                        idx = j;
                        break;
                    }
                }
                if(idx == -1) {
                    System.out.println("Menu tidak tersedia, silakan input ulang.");
                }
            } while (idx == -1);
            
            pesanan [i] = menu[idx];
            hargaPesanan[i] = harga[idx];
            total += harga[idx];
        }

        System.out.println("\n========== STRUK PESANAN ==========");
        System.out.printf("%-4s %-18s %10s%n", "No", "Pesanan", "Harga");
        System.out.println("-----------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-4d %-18s Rp%,8d%n", (i + 1), pesanan[i], hargaPesanan[i]);    
        }
        System.out.println("-----------------------------------");
        System.out.printf("%-23s Rp%,8d%n", "TOTAL BIAYA", total);
        System.out.println("===================================");

        sc.close();
    }
}
