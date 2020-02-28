import java.util.Scanner;

public class FizzBuzzString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number > ");
        int num = scan.nextInt();
        boolean div3 = num%3 == 0;
        boolean div2 = num%2 == 0;
        System.out.println((div3 ? "Fizz":"") + (div2 ? "Buzz":"") + (!div2 && !div3 ? num:"") +"!");
    }
}