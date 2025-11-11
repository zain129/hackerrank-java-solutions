package data_structures.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem URL: https://www.hackerrank.com/challenges/array-left-rotation/problem
 */
public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>(arr.subList(d, arr.size())) ;
        result.addAll(arr.subList(0, d));
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        // Expected Result: [3 4 5 1 2]
        List<Integer> rotatedArray = rotateLeft(2, List.of(1, 2, 3, 4, 5));
        System.out.println(rotatedArray);
    }
}
