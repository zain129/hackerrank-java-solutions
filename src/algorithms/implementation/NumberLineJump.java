package algorithms.implementation;

/**
 * Problem URL: <a href="https://www.hackerrank.com/challenges/kangaroo/problem">https://www.hackerrank.com/challenges/kangaroo/problem</link>
 */
public class NumberLineJump {


    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int diffVelocity = v1 - v2;
        if (diffVelocity <= 0) {
            return "NO";
        }
        int diffPosition = x1 - x2;
        return (diffPosition % diffVelocity == 0 ? "YES" : "NO");
    }


    public static void main(String[] args) {
        String result = kangaroo(0, 3, 4, 2);
//        String result = kangaroo(0,2,5,3);
        System.out.println(result);
    }


}
