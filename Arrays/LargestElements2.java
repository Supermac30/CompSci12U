import java.util.Arrays;
import java.util.Collections;

public class LargestElements2 {
    public static void main(String[] args) {
        Integer[][] data =  {{3, 2, 5, 10, 9},
                {1, 4, -4, 8, 13},
                {9, 1, 0, 2, -8},
                {0, 2, 6, 3, -1}};
        int[] values = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            values[i] = Collections.max(Arrays.asList(data[i]));
        }
        System.out.println(Arrays.toString(values));
    }
}
