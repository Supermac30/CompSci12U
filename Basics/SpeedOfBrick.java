import java.util.Scanner;
public class SpeedOfBrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of seconds");
        double inp = scan.nextDouble();
        System.out.println("Speed of the brick: " + ((int)(inp*inp*0.5*32.174*1000)/1000.0) + " feet per second");
    }
}
/*
* It takes about 3 seconds to reach one hundred miles per hour
* */