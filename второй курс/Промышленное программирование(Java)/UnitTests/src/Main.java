import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(new String("Enter the number x from -1 to 1 and pow k"));
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(3);
        try
        {
            String line = br.readLine();
            double x = Double.parseDouble(line);
            line = br.readLine();
            int k = Integer.parseInt(line);
            System.out.println(formatter.format(1/(Math.pow((x+1),3))));
            System.out.println(formatter.format(Sum.Suma(x,k)));
        }
        catch (IOException e)
        {
            System.out.println("Reading error");
        }
    }
}