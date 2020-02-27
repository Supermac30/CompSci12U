import java.util.ArrayList;

public class MergeLists {
    public static void main(String args[]) {
        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list0.add(1);
        list0.add(2);
        list0.add(4);
        list1.add(1);
        list1.add(3);
        list1.add(4);
        for (int i = 0; i < list1.size(); i++) {
            list0.add(list1.get(i));
        }
        System.out.println(list0);
    }
}
