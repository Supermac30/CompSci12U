import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first phrase> ");
        String word0 = scan.nextLine().replaceAll(" ", "");
        System.out.print("Enter second phrase> ");
        String word1 = scan.nextLine().replaceAll(" ", "");
        char[] arr0 = word0.toCharArray();
        char[] arr1 = word1.toCharArray();
        Arrays.sort(arr0);
        Arrays.sort(arr1);
        if (Arrays.equals(arr0, arr1)) {
            System.out.println("Is an anagram");
        } else {
            System.out.println("Is not an anagram");
        }
    }
}