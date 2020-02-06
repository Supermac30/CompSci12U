public class First3Times3 {
    public static void main(String args[]) {
        System.out.println(first3Times3("Java"));
    }
    public static String first3Times3(String word) {
        return new String(new char[3]).replace("\0", word.substring(0, 3));
    }
}
