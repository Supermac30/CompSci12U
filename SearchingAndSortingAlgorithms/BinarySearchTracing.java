package SearchingAndSortingAlgorithms;

public class BinarySearchTracing {
    public static void main(String args[]) {
        int[] data = {23, 27, 29, 31, 35, 39, 40, 41, 52, 66, 71, 74, 75, 90, 99};
        System.out.println(binSearch(0, data.length, data, data[0]));
        System.out.println(binSearch(0, data.length, data, data[1]));
        System.out.println(binSearch(0, data.length, data, data[2]));
    }
    public static int binSearch(int start, int end, int[] data, int look) {
        while (end >= start) {
            int mid = (start+end)/2;
            if (data[mid] == look) {
                return mid;
            } else if (data[mid] > look) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}