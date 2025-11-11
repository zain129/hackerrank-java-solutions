package data_structures.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Problem URL: https://www.hackerrank.com/challenges/sparse-arrays/problem
 */
public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        int size = queries.size();
        int[] result = new int [size];

        for (int i=0; i<size; i++) {
            String query = queries.get(i);
            int count = ((Long) (stringList.stream().filter(str -> Objects.equals(str, query)).count())).intValue();
            result[i] = count;
        }

        return Arrays.stream(result).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("ab", "bc", "ab", "bc", "ab");
        List<String> queries = List.of("ab", "bc", "cd");
        List<Integer> result = matchingStrings(stringList, queries);
        // Expected Result: [3, 2, 0]
        System.out.println(result);
    }
}
