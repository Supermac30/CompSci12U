import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word0 = scan.nextLine();
        System.out.print("Enter second word: ");
        String word1 = scan.nextLine();
        System.out.print(word0);
        System.out.print(new String(new char[30-word0.length()-word1.length()]).replace("\0", ".")); // The coolest way to repeat a sequence in java. Thank you https://stackoverflow.com/questions/2255500/can-i-multiply-strings-in-java-to-repeat-sequences
        System.out.println(word1);
    }
}