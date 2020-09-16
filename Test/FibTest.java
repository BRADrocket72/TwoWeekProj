import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibTest {
    @Test
    public void TestBaseCaseIsOne(){
        FibonacciCalculator fib = new FibonacciCalculator();
        fib.makeSequence(0,0);
        int baseCase = fib.getValueAt(0);
        Assertions.assertEquals(1,baseCase);
    }







}