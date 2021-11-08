package eu.braincluster;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DoubleFormat
{
    private boolean isInteger(double number)
    {
        return Math.ceil(number) == Math.floor(number);
    }

    private DecimalFormatSymbols getDecimalFormatSymbols()
    {
        DecimalFormatSymbols dfSymbols = new DecimalFormatSymbols();
        dfSymbols.setDecimalSeparator('.');
        dfSymbols.setGroupingSeparator(' ');
        return dfSymbols;
    }

    public String format(double value)
    {
        DecimalFormatSymbols dfSymbols = getDecimalFormatSymbols();

        String pattern = "#,###.##";
        DecimalFormat df = new DecimalFormat(pattern, dfSymbols);
        return df.format(value);
    }
}
