import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MergeListsUniqueElements {
    public static void main(String args[]) {
        Integer[] arr0 = {1, 2, 4};
        ArrayList<Integer> list0 = new ArrayList<>(Arrays.asList(arr0));
        Integer[] arr1 = {1, 3, 4};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        list0.addAll(list1);
        list0 = new ArrayList<>(new HashSet<>(list0));
        System.out.println(list0);
    }
}
