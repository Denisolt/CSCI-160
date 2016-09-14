public class PowerGeneratorTester
{
    public static void main(String[] args)
    {
        PowerGenerator MyGenerator = new PowerGenerator(10) ;
        System.out.println(1.0);
        for (int i = 0 ; i < 12 ; i++)
            System.out.printf("%.1f\n", MyGenerator.nextPower());
    }
}