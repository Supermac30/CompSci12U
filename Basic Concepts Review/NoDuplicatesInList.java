import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class NoDuplicatesInList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(list);

        HashSet temp_hash = new HashSet<>(list);
        temp_hash.add(-100);
        temp_hash.add(-8);
        System.out.println("Using HashSet - notice that after adding -100 and -8 the list does not sort itself");
        System.out.println(temp_hash);
        list = new ArrayList<>(temp_hash);
        System.out.println("List from HashSet: no duplicates but random order, not sorted");
        System.out.println(list);

        TreeSet temp_tree = new TreeSet<>(list);
        temp_tree.add(-1200);
        temp_tree.add(-200);
        System.out.println("Using TreeSet - notice that after adding new values the list sorts itself");
        System.out.println(temp_tree);
        list = new ArrayList<>(temp_tree);
        System.out.println("List from TreeSet: no duplicates and SORTED");
        System.out.println(list);


    }
}
