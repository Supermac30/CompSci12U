import java.util.Scanner;
public class AreWeThereYet {
    public static void main(String[] args) {
        // Handle input
        Scanner scan = new Scanner(System.in);
        String[] inp = scan.nextLine().split(" ");
        int[] numbers = new int[4];
        int[] prefix = new int[5];
        for (int i = 0; i < 4; i++) {
            numbers[i] = Integer.parseInt(inp[i]);
        }

        prefix[0] = numbers[0];
        for (int i = 1; i < 5; i++) {
            prefix[i] = numbers[i - 1] + prefix[i - 1];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Math.abs(prefix[i] - prefix[j]) + " ");
            }
            System.out.println();
        }
    }
}