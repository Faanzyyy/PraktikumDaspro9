package JobSheet9;
import java.util.Arrays;

public class ArrayBilangan09 {
    public static void main(String[] args) {
        // int [] bil = new int[4];
        // // bil[0] = 5;
        // // bil[1] = 13;
        // // bil[2] = -7;
        // // bil[3] = 17;

        // // dengan kode unik 
        // bil[0] = 9;
        // bil[1] = 17;
        // bil[2] = -3;
        // bil[3] = 29;

        //Modifikasi
        int [] bil = {5, 13, -7, 17};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil ["+ i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
