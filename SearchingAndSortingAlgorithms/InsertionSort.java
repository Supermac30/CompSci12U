package SearchingAndSortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        int[] data = {9, 5, 11, 6, 4, 10, 7};
        int check, temp;
        for (int end = 1; end < data.length; end++) {
            check = end;
            while (check >= 1 && data[check] < data[check-1]) {
                temp = data[check];
                data[check] = data[check-1];
                data[check-1] = temp;
                check--;
            }
            System.out.println(Arrays.toString(data));
        }
    }
}
