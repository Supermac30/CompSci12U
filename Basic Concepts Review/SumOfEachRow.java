import java.util.Arrays;

public class SumOfEachRow {
    public static void main(String args[]) {
        int [] allSums;
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8} };
        allSums = allRowSums(data);
        System.out.println(Arrays.toString(allSums));
    }

    private static int[] allRowSums(int[][] data) {
        int[] sum = new int[data.length];
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            sum[i] = total;
        }
        return sum;
    }
}
