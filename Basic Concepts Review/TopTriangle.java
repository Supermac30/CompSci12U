public class TopTriangle {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(new String(new char[9-i]).replace("\0", "  "));
            for (int j = 1; j < i+1; j++) {
                System.out.print(j + " ");
            }
            for (int j = i-1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
