import java.lang.Math;
public class PerfectIntegers {
    public static void main(String args[]) {
        for (int i = 2; i <= 100; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < Math.pow(num, 0.5); i++) {
            if (num % i == 0) {
                sum += i;
                sum += num/i;
            }
        }
        return sum == 2*num; // Multiplied by two to account for the num added to sum
    }
}
