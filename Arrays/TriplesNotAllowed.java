import java.util.Arrays;
import java.util.Scanner;
public class TriplesNotAllowed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(hasTriples(Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray())); //Thank you Luigi
    }
    public static boolean hasTriples(int[] vals) {
        for (int i = 0; i < vals.length - 2; i++) {
            if (vals[i] == vals[i+1] && vals[i] == vals[i+2]) {
                return true;
            }
        }
        return false;
    }
}
