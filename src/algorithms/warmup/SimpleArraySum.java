package algorithms.warmup;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


class Result {

    /**
     * Problem URL: https://www.hackerrank.com/challenges/simple-array-sum/problem<br><br>
     * Problem Statement:<br>
     * Given an array of integers, find the sum of its elements.
     * <p>
     * For example, if the array = [1,2,3], 1+2+3=6, so return 6.
     * <p>
     * Function Description
     * Complete the simpleArraySum function with the following parameter(s):
     * array[n]: an array of integers
     * Returns
     * int : the sum of the array elements
     * <p>
     * Input Format
     * The first line contains an integer, n, denoting the size of the array.
     * The second line contains n space-separated integers representing the array's elements.
     * <p>
     * Constraints
     * 1 <= n, ar[i] <= 1000
     * <p>
     * Sample Input
     * STDIN           Function
     * -----           --------
     * 6               ar[] size n = 6
     * 1 2 3 4 10 11   ar = [1, 2, 3, 4, 10, 11]
     * <p>
     * Sample Output
     * 31
     * <p>
     * Explanation
     * Print the sum of the array's elements: 1+2+3+4+10+11=31 .
     **/

    public static int simpleArraySum(List<Integer> integerList) {
        // Write your code here
        return integerList
                .stream()
                .mapToInt(number -> number)
                .sum();
    }

}

public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
