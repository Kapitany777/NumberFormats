package eu.braincluster;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main
{
    public static boolean isInteger(double number)
    {
        return Math.ceil(number) == Math.floor(number);
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

        DecimalFormatSymbols dfSymbols = new DecimalFormatSymbols();
        dfSymbols.setDecimalSeparator('.');
        dfSymbols.setGroupingSeparator(' ');

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
    }
}
