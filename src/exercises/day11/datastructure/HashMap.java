package exercises.day11.datastructure;

import java.util.HashSet;

public class HashMap {
    public static void main(String[] args) {
//        HashMap<String, String> strMap = new HashMap<>();
        HashSet<Integer> intSet = new HashSet<>();
//        strMap.put("a", "A");
//        strMap.put("b", "B");
//        strMap.put("a", "A New");
//        strMap.putIfAbsent("a", "new A");
//
//        strMap.forEach((k, v) -> System.out.println(k + v));

        for (int i = 0; i < 10; i++) {
            var addStatus = intSet.add(i);
            System.out.println(addStatus);
        }
        var addStatus = intSet.add(9);
        System.out.println(addStatus);
    }
}
