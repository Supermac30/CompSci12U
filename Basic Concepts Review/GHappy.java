public class GHappy {
    public static void main(String args[]) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
        System.out.println(gHappy("xxggyyggxx"));
        System.out.println(gHappy("xxggyyggxxg"));
    }
    public static boolean gHappy(String word) {
        int found = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'g') {
                found += 1;
            } else if (found == 1) {
                return false;
            } else {
                found = 0;
            }
        }
        if (found == 1) {
            return false;
        }
        return true;
    }
}
