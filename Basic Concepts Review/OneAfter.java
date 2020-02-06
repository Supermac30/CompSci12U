public class OneAfter {
    public static void main(String args[]) {
        System.out.println(oneAfter("Hiabc", "abc"));
        System.out.println(oneAfter("AbC", "HiaBc"));
        System.out.println(oneAfter("abc", "abXabc"));
    }
    public static boolean oneAfter(String word0, String word1) {
        boolean cond0 = word0.substring(word0.length()-3).toLowerCase().equals(word1.toLowerCase());
        boolean cond1 = word1.substring(word1.length()-3).toLowerCase().equals(word0.toLowerCase());
        return cond0 || cond1;
    }
}
