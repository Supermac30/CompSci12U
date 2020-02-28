// Thank you http://people.csail.mit.edu/indyk/6.838-old/handouts/lec17.pdf
public class TwoNearest {
    static double[][] points = {{-1, 3}, {-1, -1}, {1, 1}, {2, 0.5}, {2, -1}, {3, 3}, {4, 2}, {4, -0.5}};
    public static void helper() {

    }
    public static void main(String args[]) {
        System.out.println(findMin(0, points.length));
    }
    public static double cartDist(int p0, int p1) {
        return Math.sqrt(Math.pow(points[p0][0]-points[p1][0], 2) + Math.pow(points[p0][1]-points[p1][1], 2));
    }
    public static double findMin(int start, int end) {
        double min = Double.POSITIVE_INFINITY;
        if (end-start <= 3) {
            for (int i = start; i < end; i++) {
                for (int j = i+1; j < end; j++) {
                    min = Math.min(min, cartDist(i, j));
                }
            }
        }
        else {
            // Three possible locations for the min is the left, right and through the centre
            int mid = (end+start)/2;
            min = Math.min(Math.min(min, findMin(start, mid)), findMin(mid, end));
            boolean found = false;
            int stripStart = 0, stripEnd = 0;
            for (int i = start; i < end; i++) {
                if (points[mid][0] - points[i][0] < min) {
                    if (!found) {
                        stripStart = i;
                        found = true;
                    }
                }
                else if (found) {
                    stripEnd = i;
                    break;
                }
            }
            /*
            // naive
            for (int i = stripStart; i < stripEnd; i++) {
                for (int j = i + 1; i < stripEnd; j++) {
                    min = Math.min(cartDist(i, j), min);
                }
            }
            */

        }
        return min;
    }
}