import org.junit.Assert;
import org.junit.Test;


public class FibonacciTest {
    @Test
    public void firstUnitTest(){
        Fibonacci fibonacci = new Fibonacci();
        Assert.assertEquals(1, fibonacci.get(1));
    }
}
