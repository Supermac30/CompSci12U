import java.util.Scanner;

public class MiddleLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String inp = scan.nextLine();
        if (inp.length() % 2 == 0) {
            System.out.print(inp.charAt((inp.length()/2) - 1) + "" + inp.charAt(inp.length()/2));
        } else {
            System.out.print(inp.charAt(inp.length()/2));
        }
        System.out.println(" is the middle");
    }
}
/*
    Enter a word
    qwer
    we is the middle
*/