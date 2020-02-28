public class EvensAndOdds {
    public static void main(String args[]) {
        int[] rand = new int[25];
        for (int i = 0; i < 25; i++) {
            rand[i] = (int)(Math.random()*100);
        }
        System.out.println("Odd:");
        for (int i = 0; i < 25; i++) {
            if (rand[i] % 2 == 1) {
                System.out.print(rand[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Even:");
        for (int i = 0; i < 25; i++) {
            if (rand[i] % 2 == 0) {
                System.out.print(rand[i] + " ");
            }
        }
    }
}
