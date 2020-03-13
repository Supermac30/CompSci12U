package SearchingAndSortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int[] data = {5, 10, 5, 4, 9, 7};
        for (int end = data.length-1; end > 0; end--) {
            boolean found = false;
            for (int i = 0; i < end; i++) {
                if (data[i] > data[i+1]) {
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    found = true;
                }
            }
            if (!found) {
                break;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
