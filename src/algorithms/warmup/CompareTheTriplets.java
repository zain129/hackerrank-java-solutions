package algorithms.warmup;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /**
     * Problem URL: https://www.hackerrank.com/challenges/compare-the-triplets/problem <br>
     **/

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0, bobScore = 0;

        /* START: Using for-loop  **/
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        /* END: Using for-loop **/

        /* START: Using stream: NOT RECOMMENDED for submission, just an additional solution **/
//        List<Boolean> compareResult = IntStream.range(0, a.size())
//                .mapToObj(i -> a.get(i) > b.get(i) ? true : a.get(i) < b.get(i) ? false : null)
//                .toList();
//        aliceScore = (int) compareResult.stream().filter(x -> x).count();   // A 'true' element shows that Alice has scored a point
//        bobScore = (int) compareResult.stream().filter(x -> !x).count();    // A 'false' element shows that Bob has scored a point
        /* END: Using stream **/

        return List.of(aliceScore, bobScore);
    }

}

public class CompareTheTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

