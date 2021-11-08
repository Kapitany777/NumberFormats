package eu.braincluster;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main
{
    public static boolean isInteger(double number)
    {
        return Math.ceil(number) == Math.floor(number);
    }

    private static DecimalFormatSymbols getDecimalFormatSymbols()
    {
        DecimalFormatSymbols dfSymbols = new DecimalFormatSymbols();
        dfSymbols.setDecimalSeparator('.');
        dfSymbols.setGroupingSeparator(' ');
        return dfSymbols;
    }

    private static void numberFormat1()
    {
        double value = 123456789.456;

        String pattern = "#,###.###";
        DecimalFormat df = new DecimalFormat(pattern);
        System.out.println(df.format(value));
    }

    private static void numberFormat2()
    {
        double value = 123456789.456;

        DecimalFormatSymbols dfSymbols = getDecimalFormatSymbols();

        String pattern = "#,###.###";
        DecimalFormat df = new DecimalFormat(pattern, dfSymbols);
        System.out.println(df.format(value));
    }

    private static void numberFormat3(double value)
    {
        DecimalFormatSymbols dfSymbols = getDecimalFormatSymbols();

        String format = isInteger(value) ? "#" : "#,###.###";
        String pattern = "#,###.###";
        DecimalFormat df = new DecimalFormat(pattern, dfSymbols);
        System.out.println(df.format(value));
    }

    public static void main(String[] args)
    {
        System.out.println("Example 1");
        numberFormat1();
        System.out.println();

        System.out.println("Example 2");
        numberFormat2();
        System.out.println();

        System.out.println("Example 3");
        numberFormat3(1234.5678);
        System.out.println();

        System.out.println("Example 4");
        numberFormat3(1234);
        System.out.println();

        System.out.println("Example 5");
        numberFormat3(0);
        System.out.println();
    }
}
