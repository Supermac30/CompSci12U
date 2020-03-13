package SearchingAndSortingAlgorithms;

public class Frequency {
    public static void main(String args[]) {
        int amount = 1000;
        int[] vals = new int[amount];
        for (int i = 0; i < amount; i++) {
            vals[i] = (int)(1+10*Math.random());
        }
        int[] frequency = new int[10];
        for (int i = 0; i < amount; i++) {
            frequency[vals[i]-1]++;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] != 0) {
                System.out.print((i+1) + " ");
            }
        }
        System.out.println();
        System.out.println("Value Frequency");
        for (int i = 0; i < 9; i++) {
            if (frequency[i] != 0) {
                System.out.println((i + 1) + "    " + frequency[i]);
            }
        }
        if (frequency[9] != 0) {
            System.out.println("10   " + frequency[9]);
        }
    }
}
