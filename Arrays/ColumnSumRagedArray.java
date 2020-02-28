public class ColumnSumRagedArray {
    public static void main(String args[]) {
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8} };
        System.out.println(columnSum(data, 5));
    }
    public static int columnSum(int[][] data, int i) {
        int sum = 0;
        for (int j = 0; j < data.length; j++) {
            if (i < data[j].length) {
                sum += data[j][i];
            }
        }
        return sum;
    }
}
