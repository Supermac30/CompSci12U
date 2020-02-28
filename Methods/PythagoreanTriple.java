public class PythagoreanTriple {
    public static void main(String args[]) {
        for (int c = 1; c < 100; c++) {
            for (int b = 1; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    if (isTriple(a, b, c)) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
    public static boolean isTriple(int a, int b, int c) {
        return Math.pow(a*a+b*b, 0.5) == c;
    }
}
