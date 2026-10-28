package JobSheet4;
import java.util.Scanner;

public class TugasParkir09 {
    public static void main(String[] args) {
        Scanner fandi = new Scanner(System.in);

        int lamaParkir;
        int tarif = 2000;

        System.out.println("Masukkan lama parkir: ");
        lamaParkir = fandi.nextInt();

        if ( lamaParkir <= 2) {
            System.out.println("Tarif parkir = " + tarif);
        } else {
            System.out.println("Tarif parkir = " + (tarif + (lamaParkir - 2) * 1000));
        }
    }
}
