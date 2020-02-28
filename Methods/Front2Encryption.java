public class Front2Encryption {
    public static void main(String args[]) {
        System.out.println(front2Encryption("kitten"));
        System.out.println(front2Encryption("Ha"));
        System.out.println(front2Encryption("abc"));
    }
    public static String front2Encryption(String word) {
        String first = word.substring(0, word.length() >= 2 ? 2:word.length());
        return first+word+first;
    }
}
