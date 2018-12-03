package findduplicatesinarray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInArray {

    public static void main(String[] args) {
        String[] names = {"ana", "ion", "costel", "ana", "gigel", "ion"};

        int[] intArr = new int[]{1, 2, 1, 2, 1, 3, 4, 6, 2, 8};

        // First solution : finding duplicates using brute force method
        findDuplicatesBruteForce(names);
        // Second solution : use HashSet data structure to find duplicates
        findDuplicatesHashSet(names);
        // Third solution : using HashMap data structure to find duplicates
        findDuplicatesHashMap(names);

        System.out.println("=============");

        findDuplicateInArray(intArr);
    }

    private static void findDuplicatesHashMap(String[] names) {
        Map<String, Integer> nameAndCount = new HashMap<>();
        // build hash table with count
        for (String name : names) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }
        // Print duplicate elements from array in Java
        Set<Map.Entry<String, Integer>> entrySet = nameAndCount.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array with HashMap: " + entry.getKey());
            }
        }


    }

    private static void findDuplicatesHashSet(String[] names) {
        Set<String> store = new HashSet<>();
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("found a duplicate element in array with HashSet: " + name);
            }
        }

    }

    private static void findDuplicatesBruteForce(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    // got the duplicate element
                    System.out.println(names[i] + " duplicate " + names[j]);
                }
            }
        }

    }

    public static void findDuplicateInArray(int[] a) {
        int count = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                if (a[j] == a[k]) {
                    count++;
                }
            }
            if (count == 1)
                System.out.println(a[j]);
            count = 0;
        }
    }
}

