public class Calcops {
    public double sqrt(double n)
    {
        return Math.sqrt(n);
    }
    public double factorial(double n)
    {
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
        return Math.log(n);
    }
    public double power(double m, double n)
    {
        return Math.pow(m,n);
    }
}
