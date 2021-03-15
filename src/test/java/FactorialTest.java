import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FactorialTest {

    @Parameter(0)
    public double a;

    @Parameter(1)
    public double result;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {{3.0,6.0}, {4.0,24.0}, {5.0,120.0} };
        return Arrays.asList(data);
    }

    @Test
    public void test() {
        Calcops c = new Calcops();
        Assert.assertEquals("Sqrt Test", result, c.factorial(a), 0.01);
    }
}
