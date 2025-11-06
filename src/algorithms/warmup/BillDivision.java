package algorithms.warmup;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /**
     * Problem URL: https://www.hackerrank.com/challenges/bon-appetit/problem
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        /*
            bill: an array of integers representing the cost of each item ordered
            k: an integer representing the zero-based index of the item Anna doesn't eat
            b: the amount of money that Anna contributed to the bill
        */
        int totalBillToBeCharged = (bill.stream().mapToInt(num -> num).sum()) - bill.get(k);
        int toBeChargedFromAnna = totalBillToBeCharged / 2;

        if (Objects.equals(toBeChargedFromAnna, b)) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - toBeChargedFromAnna);
        }
    }

}

public class BillDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
