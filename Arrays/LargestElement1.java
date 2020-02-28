import java.util.Arrays;
import java.util.Collections;

class LargestElement1 {
    public static void main(String[] args) {
        Integer[][] data =  {{3, 2, 5, 10, 9},
                         {1, 4, -4, 8, 13},
                         {9, 1, 0, 2, -8},
                         {0, 2, 6, 3, -1}};
        for (int i = 0; i < data.length; i++) {
            System.out.println(Collections.max(Arrays.asList(data[i])));
        }
    }
}
