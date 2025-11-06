package algorithms.warmup;

import java.io.*;

class Result {

    /**
     * Problem URL: https://www.hackerrank.com/challenges/maximizing-xor/problem
     */

    public static int maximizingXor(int l, int r) {
        // Write your code here
        int maxXor = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {
                int result = i ^ j;
                System.out.println(i + " XOR " + j + " = " + result);
                if (result > maxXor) {
                    maxXor = result;
                }
            }
        }
        return maxXor;

    }

}

public class MaximizingXOR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.maximizingXor(l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
