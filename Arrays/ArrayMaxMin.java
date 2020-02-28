public class ArrayMaxMin {
    public static void main(String args[]) {
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8}};
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                max = Math.max(data[i][j], max);
                min = Math.min(data[i][j], min);
            }
        }
        System.out.println("Max is " + max + " and min is " + min);
    }
}
