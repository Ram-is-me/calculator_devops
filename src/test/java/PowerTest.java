import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PowerTest {

    @Parameter(0)
    public double a;

    @Parameter(1)
    public double b;

    @Parameter(2)
    public double result;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {{2.0,2.0,4.0}, {3.0,2.0,9.0}, {5.0,3.0,125.0} };
        return Arrays.asList(data);
    }

    @Test
    public void test() {
        Calcops c = new Calcops();
        Assert.assertEquals("Sqrt Test", result, c.power(a,b), 0.01);
    }
}
