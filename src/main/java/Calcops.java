import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calcops {
    public static final Logger logger = LogManager.getLogger(Calcops.class);
    public double sqrt(double n)
    {
        logger.info("Sqrt Calculation");
        return Math.sqrt(n);
    }
    public double factorial(double n)
    {
        logger.info("Factorial Calculation");
        int a = (int) n;
        int result = 1;
        while(a>=1)
        {
            result *= a;
            a--;
        }
        return (double) result;

    }
    public double log(double n)
    {
        logger.info("Natural Logarithm Calculation");
        return Math.log(n);
    }
    public double power(double m, double n)
    {
        logger.info("Power Calculation");
        return Math.pow(m,n);
    }
}
