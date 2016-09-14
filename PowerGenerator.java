public class PowerGenerator
{
    private double product = 1;
    public PowerGenerator(double factor) 
    { 
        factor = Math.sqrt(factor);
    }

    public double nextPower() 
    { 
        return product *=10;
    }
}