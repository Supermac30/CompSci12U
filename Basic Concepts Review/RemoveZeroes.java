import java.util.ArrayList;
import java.util.Arrays;

public class RemoveZeroes {
    public static void main(String args[]) {
        Integer[] arr0 = {3,1,4,1,5,-1,-1,-1,-2,-1,5,4,3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr0));
        int[] loc = sumZero(list, 0, list.size()-1);
        while (loc[0] != -1) {
            list.subList(loc[0], loc[1]+1).clear();
            loc = sumZero(list, 0, list.size()-1);
        }
        System.out.println(list);
    }
    public static int[] sumZero(ArrayList<Integer> list, int start, int end) {
        // divide and conquer solves this in, I think, Θ(n(lg n)^2) time
        int[] loc = {-1, -1};
        if (list.size() <= 1) {
            return loc;
        }
        if (start == end-1) {
            if (list.get(start) + list.get(end) == 0) {
                loc[0] = start;
                loc[1] = start+1;
            }
            return loc;
        }
        int mid = (start+end)/2;
        loc = sumZero(list, start, mid);
        if (loc[0] != -1) {
            return loc;
        }
        loc = sumZero(list, mid, end);
        if (loc[0] != -1) {
            return loc;
        }
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(0);
        for (int i = mid; i <= end; i++) {
            vals.add(vals.get(i-mid) + list.get(i));
        }
        int total = 0;
        for (int i = mid-1; i >= 0; i--) {
            total += list.get(i);
            int location = vals.indexOf(-total);
            if (location != -1) {
                loc[0] = i;
                loc[1] = location+mid;
                break;
            }
        }
        return loc;
    }
}
