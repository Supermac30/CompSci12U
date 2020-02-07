public class OneAfter {
    public static void main(String args[]) {
        System.out.println(oneAfter("Hiabc", "abc"));
        System.out.println(oneAfter("AbC", "HiaBc"));
        System.out.println(oneAfter("abc", "abXabc"));
    }
    public static boolean oneAfter(String word0, String word1) {
        if (word0.length() > word1.length()) {
            return word0.substring(word0.length()-word1.length()).toLowerCase().equals(word1.toLowerCase());
        }
        return word1.substring(word1.length()-word0.length()).toLowerCase().equals(word0.toLowerCase());
    }
}
