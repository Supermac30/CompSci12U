import java.util.Scanner;
public class Nim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stones = (int)(Math.random()*16 + 15);
        boolean playerTurn = true;
        while (stones > 0) {
            System.out.print("There are " + stones + " stones.");
            if (playerTurn) {
                System.out.print("How many would you like? ");
                String inp = scan.nextLine();
                while (!isValidEntry(inp)) {
                    System.out.println("Input a number between 1 and 3 inclusive. ");
                    inp = scan.nextLine();
                }
                stones -= Integer.parseInt(Character.toString(inp.charAt(0)));
            } else {
                int compTake = drawStones();
                stones -= compTake;
                System.out.print("The computer takes " + compTake + " stones.");
            }
            playerTurn = !playerTurn;
            System.out.println();
        }
        if (playerTurn) {
            System.out.println("THE PLAYER BEATS THE COMPUTER!");
        } else {
            System.out.println("THE COMPUTER BEATS THE PLAYER!");
        }
    }
    public static boolean isValidEntry(String inp) {
        return inp.charAt(0) > '0' && inp.charAt(0) < '4';
    }
    public static int drawStones() {
        return (int)(Math.random()*3 + 1);
    }
}
