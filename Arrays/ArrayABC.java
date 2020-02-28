public class ArrayABC {
    public static void main(String args[]) {
        String[] arr = {"A", "A", "B", "C", "A"};
        System.out.println(arrayABC(arr)); // → true
        String[] arr0 = {"A","A", "B", "D", "A"};

        System.out.println(arrayABC(arr0)); // → false
        String[] arr1 = {"A", "A", "B", "C", "A"};
        System.out.println(arrayABC(arr1)); // → true
    }
    public static boolean arrayABC(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].equals("A") || arr[i].equals("B") || arr[i].equals("C"))) {
                return false;
            }
        }
        return true;
    }
}
