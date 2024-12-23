package Abstraction;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class HashMapClass{
	void show() {
		System.out.println("Hash Map");
		Map<String, Integer> map = new HashMap<>();
        map.put("Siva", 23);
        map.put("Muhi", 8);
        map.put("Ram", 29);
        System.out.println(map.get("Ram")); 
        System.out.println(map.containsKey("Karan")); 
        System.out.println(map.keySet()); 
        map.remove("Ram");
        for (String name : map.keySet()) {
            System.out.println(name + ": " + map.get(name));
        }
        for (Integer age : map.values()) {
            System.out.println(age);
        }
        System.out.println();
	}
}

class TreeMapClass{
	void display() {
		System.out.println("Tree map");
		Map<String, Integer> map1 = new TreeMap<>();
        map1.put("Siva", 23);
        map1.put("Muhi", 8);
        map1.put("Ram", 29);
        System.out.println(map1);
	}
}

class LinkedHashMapClass{
	void output() {
		System.out.println("Linked Hash Map");
        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Muhi", 8);
        map2.put("Ram", 29);
        map2.put("Siva", 23);
        System.out.println(map2);
	}
}

public class Maps {

	public static void main(String[] args) {
		HashMapClass hashmapclass = new HashMapClass();
		hashmapclass.show();
		
		TreeMapClass treemapclass = new TreeMapClass();
		treemapclass.display();
		
		LinkedHashMapClass linkedhashmapclass = new LinkedHashMapClass();
		linkedhashmapclass.output();
		
	}

}
