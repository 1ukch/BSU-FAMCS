import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {
    public int getNNumberFib(int n) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n2;
    }

    public int getNNumberFibRec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return getNNumberFibRec(n - 1) + getNNumberFibRec(n - 2);
        }
    }

    public List<Integer> getFirstNNumbersFib(int n) {
        List<Integer> fib = new ArrayList<>();
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        fib.add(1);
        if (n == 1) {
            return fib;
        }
        fib.add(1);
        if (n == 2) {
            return fib;
        }
        for (int i = 3; i <= n; i++) {
            n2 = n0 + n1;
            fib.add(n2);
            n0 = n1;
            n1 = n2;
        }
        return fib;
    }

    public int get(int i) {
    }
}