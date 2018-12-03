package findpairsofintsumnr;

import java.util.HashSet;
import java.util.Set;

public class FindPairsOfIntegersSumNr {
    public static void main(String[] args) {
        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};

      //  printPairs(numbersWithDuplicates, 7);
        printPairsUsingSet(numbersWithDuplicates, 7);

    }

    /**
     * Prints all pair of integer values from given array whose sum is is equal to given number. * complexity of this solution is O(n^2)
     */
    public static void printPairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }
    }

    /**
     * Given an array of integers finds two elements in the array whose sum is equal to sum. * @param numbers * @param sum
     */
    public static void printPairsUsingSet(int[] numbers, int sum) {
        if (numbers.length < 2) {
            return;
        }
        Set set = new HashSet(numbers.length);
        for (int value : numbers) {
            int target = sum - value; // if target number is not in set then add
            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }


}
