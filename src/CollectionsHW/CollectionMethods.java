package CollectionsHW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionMethods {

    public static void main(String[] args) {

        HashSet<Integer> list1 = new HashSet<>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);

        ArrayList<Integer> newList = new ArrayList<>(list1);
//        newList.add(10);

//        list1.addAll(newList);
//        list1.removeAll(newList);
//        list1.clear();

//        boolean hasValue = list1.contains(48);
//        boolean hasValue = list1.isEmpty();
//        boolean hasValue = list1.retainAll();
        Collections.sort(newList);
        System.out.println(newList);
    }
}
