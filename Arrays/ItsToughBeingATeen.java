import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ItsToughBeingATeen {
    public static void main(String args[]) {
        HashMap<Integer, ArrayList<Integer>> prereq = new HashMap<>(7);
        for (int i = 0; i < 7; i++) {
            prereq.put(i, new ArrayList<>());
        }
        prereq.get(0).add(1);
        prereq.get(3).add(0);
        prereq.get(4).add(2);
        prereq.get(6).add(0);
        Scanner scan = new Scanner(System.in);
        int inp0 = scan.nextInt();
        int inp1 = scan.nextInt();
        while (inp0 != 0 && inp1 != 0) {
            prereq.get(inp1-1).add(inp0-1);
            inp0 = scan.nextInt();
            inp1 = scan.nextInt();
        }
        int counter = 0;
        int[] list = new int[7];
        boolean allEmpty, stuck;
        do {
            allEmpty = true;
            stuck = true;
            for (int i = 0; i < 7; i++) {
                if (prereq.containsKey(i)) {
                    if (prereq.get(i).isEmpty()) {
                        stuck = false;
                        prereq.remove(i);
                        for (int j = 0; j < 7; j++) {
                            if (prereq.containsKey(j)) {
                                if (prereq.get(j).contains(i)) {
                                    prereq.get(j).remove(Integer.valueOf(i));
                                }
                            }
                        }
                        list[counter] = i + 1;
                        counter++;
                        break;
                    }
                }
            }
            for (int i = 0; i < 7; i++) {
                if (prereq.containsKey(i)){
                    allEmpty = false;
                    break;
                }
            }
        } while (!allEmpty && !stuck);
        if (allEmpty) {
            for (int i = 0; i < 7; i++) {
                System.out.print(list[i] + " ");
            }
        } else {
            System.out.println("Cannot complete these tasks. Going to bed.");
        }
    }
}
