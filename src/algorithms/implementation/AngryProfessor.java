package algorithms.implementation;

import java.util.List;

/**
 * Problem URL: <a href="https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true">https://www.hackerrank.com/challenges/angry-professor/problem</a>
 */
public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        long studentArrivedOnTime = a.stream().filter(arrivalTime -> arrivalTime <= 0).count();
        return (studentArrivedOnTime < k) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        int k = 3;
        List<Integer> a = List.of(-1, -3, 4, 2);
//        int k = 2;
//        List<Integer> a = List.of(0,-1,  2,1);
        String result = angryProfessor(k, a);
        System.out.println(result);
    }


}
