package SearchingAndSortingAlgorithms;

public class BinarySearchWithMultiples {
    public static void main(String args[]) {
        int[] data = {1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4};
        System.out.println(binSearch(0, data.length, data, 2));
        System.out.println(binSearch(0, data.length, data, 1));
    }
    public static int first(int loc, int[] data) {
        while (loc > 0 && data[loc-1] == data[loc]) {
            loc -= 1;
        }
        return loc;
    }
    public static int binSearch(int start, int end, int[] data, int look) {
        while (end >= start) {
            int mid = (start+end)/2;
            if (data[mid] == look) {
                return first(mid, data);
            } else if (data[mid] > look) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
