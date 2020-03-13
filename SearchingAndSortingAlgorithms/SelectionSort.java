package SearchingAndSortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        String[] data = {"Rottweiler", "Beagle", "Vizsla", "Dachshund", "Schnauzer"};
        int largest;
        for (int i = data.length-1; i > 0; i--) {
            largest = 0;
            for (int j = 1; j <= i; j++) {
                if (data[largest].compareTo(data[j]) < 0) {
                    largest = j;
                }
            }
            String temp = data[largest];
            data[largest] = data[i];
            data[i] = temp;
        }
        System.out.println(Arrays.toString(data));
    }
}
