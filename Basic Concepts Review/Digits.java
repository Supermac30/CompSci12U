import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int val = scan.nextInt();
        System.out.println("The ones-place digit is: " + (val%10));
        System.out.println("The tens-place digit is: " + (val%100)/10);
        System.out.println("The hundreds-place digit is: " + (val/100));
    }
}
/*
*
    Enter a three-digit number:  267
    The ones-place digit is: 7
    The tens-place digit is: 6
    The hundreds-place digit is: 2
* */