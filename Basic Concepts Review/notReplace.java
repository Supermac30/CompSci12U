public class notReplace {
    public static void main(String args[]) {
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
        System.out.println(notReplace("This is right is"));
        System.out.println(notReplace("isThis isrightis"));
    }
    public static String notReplace(String word) {
        if (word.substring(0, 2).equals("is") && !('A' < word.charAt(2) && 'Z' > word.charAt(2) || 'a' < word.charAt(2) && 'z' > word.charAt(2))) {
            word = "is not" + word.substring(2);
        }
        for (int i = 1; i < word.length()-3; i++) {
            if (word.substring(i, i+2).equals("is") && !('A' < word.charAt(i-1) && 'Z' > word.charAt(i-1) || 'a' < word.charAt(i-1) && 'z' > word.charAt(i-1)) && !('A' < word.charAt(i+2) && 'Z' > word.charAt(i+2) || 'a' < word.charAt(i+2) && 'z' > word.charAt(i+2))) {
                word = word.substring(0, i) + "is not" + word.substring(i+2);
            }
        }
        if (word.substring(word.length()-2).equals("is") && !('A' < word.charAt(word.length()-3) && 'Z' > word.charAt(word.length()-3) || 'a' < word.charAt(word.length()-3) && 'z' > word.charAt(word.length()-3))) {
            word = word.substring(0, word.length()-2) + "is not";
        }
        return word;
    }
}
