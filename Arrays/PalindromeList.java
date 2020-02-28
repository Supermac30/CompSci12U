import java.util.ArrayList;

public class PalindromeList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(2);
        System.out.println(isPalindrome(list));
    }
    public static boolean isPalindrome(ArrayList<Integer> list) {
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i) != list.get(list.size()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
