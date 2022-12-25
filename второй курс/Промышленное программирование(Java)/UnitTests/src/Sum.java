import org.junit.jupiter.api.function.Executable;

public class Sum {
    public static double Suma(double x, int k) {
        if(x>=1||x<=-1){
            throw new IllegalArgumentException("x doesn't belong the interval(-1, 1)!");
        }
        else if (k <= 0) {
            throw new IllegalArgumentException("Pow k isn't natural number");
        }
        double e = Math.pow(10,-k);
        double temp  = 1;
        double i = 0;
        double result = 1;
        while(Math.abs(temp)>e) {
            temp*=(-1)*(x*(i+3))/(i+1);
            result += temp;
            i++;
        }
        return result;
    }
}