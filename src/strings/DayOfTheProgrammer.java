package strings;

import java.io.*;

class Result {

    /**
     * Problem URL: https://www.hackerrank.com/challenges/day-of-the-programmer/problem
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        String day = "13", leapDay = "12", month = "09", day1918 = "26";
        String date = day + "." + month + "." + year;

        if (year == 1918) {
            //January 31st -> February 14th in 1918 means missing 13 days
            date = day1918 + "." + month + "." + year;
        } else {
            if ((year < 1918 && year % 4 == 0) ||
                    (year > 1918 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))) {
                date = leapDay + "." + month + "." + year;
            }
        }

        System.out.println(date);
        return date;
    }

}

public class DayOfTheProgrammer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

