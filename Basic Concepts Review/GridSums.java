import java.util.Arrays;
import java.util.Scanner;

public class GridSums {
    static int[][] vals;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = Integer.parseInt(scan.nextLine());
        vals = new int[len][len];
        for (int i = 0; i < len; i++) {
            vals[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int amount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < amount; i++) {
            int[] loc = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println((sumRow(loc[0]-1)+sumCol(loc[1]-1)));
        }
    }

    private static int sumCol(int i) {
        int total = 0;
        for (int j = 0; j < vals.length; j++) {
            total += vals[j][i];
        }
        return total;
    }

    private static int sumRow(int i) {
        int total = 0;
        for (int val : vals[i]) {
            total += val;
        }
        return total;
    }
}