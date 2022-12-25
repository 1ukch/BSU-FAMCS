import java.math.BigDecimal;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static double GetSumOfNumbersRegEx(String line) {
        StringTokenizer st = new StringTokenizer(line, " \t\n\r,");
        double sum = 0;
        while(st.hasMoreTokens()){
            String el = st.nextToken();
            if (el.matches("(^-|^\\+)?[0-9]+((\\.)?[0-9]*(e[0-9]+)?)?$")) {
                double num = Double.parseDouble(el);
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the string, which include numbers");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Sum of numbers =: " + GetSumOfNumbersRegEx(str));
    }
}