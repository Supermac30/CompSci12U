import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lockers {
    public static void main(String args[]) {
        Boolean[] lockersarr = new Boolean[1001];
        Arrays.fill(lockersarr, Boolean.FALSE);
        ArrayList<Boolean> lockers = new ArrayList<>(Arrays.asList(lockersarr));
        for (int i = 1; i <= 1000; i++) {
            for (int j = i; j <= 1000; j+=i) {
                lockers.set(j, !lockers.get(j));
            }
        }
        System.out.println(Collections.frequency(lockers, true));
        //System.out.println((int)Math.pow(1000, 0.5)); // you can do this instead
    }
}