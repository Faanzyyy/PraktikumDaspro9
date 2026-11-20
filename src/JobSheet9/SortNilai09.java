// Elemen Dasar Array B 20 + (9 mod 60 = 9) = 29

package JobSheet9;
import java.util.Arrays;
public class SortNilai09 {
    public static void main(String[] args) {
        // int[] nilai = {78, 65, 90, 55, 88, 72};
        int [] nilai = {29, 44, 21, 59, 9, 34};
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai [j + 1]) {
                    int temp = nilai[j];
                    nilai [j] = nilai [j + 1];
                    nilai [j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
