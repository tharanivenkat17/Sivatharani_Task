package Abstraction;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Kiwi");
        set.add("Apple");
        set.add("Banana");
        
        // Add duplicate
        boolean isAdded = set.add("Apple");
        System.out.println(isAdded);
        System.out.println(set);
        System.out.println(set.contains("Banana"));
        set.remove("Banana");
        System.out.println(set);
        System.out.println();
        
        
        Set<String> lset = new LinkedHashSet<>();
        lset.add("Apple");
        lset.add("Banana");
        lset.add("Kiwi");
        System.out.println(lset);
        lset.remove("Banana");
        System.out.println(lset);
        System.out.println();
        
        Set<Integer> l1set = new LinkedHashSet<>();
        l1set.add(20);
        l1set.add(30);
        l1set.add(10);
        System.out.println(l1set);
        l1set.remove(20);
        System.out.println(l1set);
        System.out.println();
        
        
        Set<String> tset = new TreeSet<>();
        tset.add("Apple");
        tset.add("Kiwi");
        tset.add("Banana");
        System.out.println(tset);
        System.out.println(tset.contains("Kiwi"));
        System.out.println(((TreeSet<String>) tset).first());
        System.out.println(((TreeSet<String>) tset).last());
	}

}
