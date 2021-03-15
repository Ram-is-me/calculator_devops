import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LogarithmTest {

    @Parameter(0)
    public double a;

    @Parameter(1)
    public double result;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {{5.0,1.6094}, {8.0,2.0794}, {25.0,3.2188} };
        return Arrays.asList(data);
    }

    @Test
    public void test() {
        Calcops c = new Calcops();
        Assert.assertEquals("Sqrt Test", result, c.log(a), 0.01);
    }
}
