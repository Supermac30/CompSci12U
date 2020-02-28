public class RowSum {
    public static void main(String args[]) {
        int rowSum;
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8} };
        rowSum = rowSums(data,0);
        System.out.println(rowSum);
    }

    private static int rowSums(int[][] data, int i) {
        int sum = 0;
        for (int j = 0; j < data[i].length; j++) {
            sum += data[i][j];
        }
        return sum;
    }
}
