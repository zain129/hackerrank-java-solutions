package simple_java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    /**
     * Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
     * <p>
     * US: formattedPayment
     * India: formattedPayment
     * China: formattedPayment
     * France: formattedPayment
     * where formattedPayment is payment formatted according to the appropriate Locale's currency.
     * <p>
     * Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
     * <p>
     * Input Format
     * A single double-precision number denoting .
     * <p>
     * Constraints
     * 0 <= payment <= 10^9
     * <p>
     * Output Format
     * <p>
     * On the first line, print US: u where u is payment formatted for US currency.
     * On the second line, print India: i where i is payment formatted for Indian currency.
     * On the third line, print China: c where c is payment formatted for Chinese currency.
     * On the fourth line, print France: f, where f is payment formatted for French currency.
     * <p>
     * Sample Input
     * 12324.134
     * <p>
     * Sample Output
     * US: $12,324.13
     * India: Rs.12,324.13
     * China: ￥12,324.13
     * France: 12 324,13 €
     * <p>
     * Explanation
     * Each line contains the value of  formatted according to the four countries' respective currencies.
     **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        final String indCountryCode = "IN";
        Locale usLocale = new Locale(Locale.ENGLISH.getLanguage(), Locale.US.getCountry());
        Locale cnLocale = new Locale(Locale.CHINESE.getLanguage(), Locale.CHINA.getCountry());
        Locale frLocale = new Locale(Locale.FRENCH.getLanguage(), Locale.FRANCE.getCountry());
        Locale indiLocale = new Locale(Locale.ENGLISH.getLanguage(), indCountryCode);

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(usLocale);
        String us = numberFormat.format(payment);
        System.out.println("US: " + us);

        numberFormat = NumberFormat.getCurrencyInstance(indiLocale);
        String india = numberFormat.format(payment);
        System.out.println("India: " + india);

        numberFormat = NumberFormat.getCurrencyInstance(cnLocale);
        String china = numberFormat.format(payment);
        System.out.println("China: " + china);

        numberFormat = NumberFormat.getCurrencyInstance(frLocale);
        String france = numberFormat.format(payment);
        System.out.println("France: " + france);
    }

}
