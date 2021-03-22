package CollectionsHW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ComparableDemo {
    public static void main(String[] args) {

        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee("Mike", 3500, "Accounting"));
        hashSet.add(new Employee("Paul", 3000, "Admin"));
        hashSet.add(new Employee("Peter", 4000, "IT"));
        hashSet.add(new Employee("Angel", 2000, "Maint"));

        ArrayList<Employee> newList = new ArrayList<>(hashSet);
        Collections.sort(newList);
        System.out.println(newList);
    }
}
