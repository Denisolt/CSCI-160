//Denisolt Shakhbulatov 10.27.2015
/* ____________________________________________
+                    APLINE                   +
+_____________________________________________+
+                    -a: int                  +
+                    -b: int                  +
+                    -c: int                  +
+_____________________________________________+
+     +APLine(a: int, b: int, c:int):         + 
+           +getSlope():double                +
+           +isOnLine(x,y):boolean            +
_______________________________________________
 */
public class APLine
{
    private int a;
    private int b;
    private int c;
    
    public APLine( int A, int B, int C)
    {
        a = A;
        b = B;
        c = C;
    }

    public double getSlope()
    {
        double slope = (double)-a/b;
        return slope;
    }

    public boolean isOnLine(int x, int y)
    {   int check = (a*x) + (b*y) + (c);
        if (check!=0)
            return false;
        else
            return true;
    }

    public static void main(String[] arg)
    {
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5,-2);
        
        System.out.println("slope1 is assigned " + line1.getSlope());
        System.out.println(line1.isOnLine(5,-2));
        
        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5,-2);
        
        System.out.println("slope2 is assigned " + line2.getSlope());
        System.out.println(line2.isOnLine(5,-2));
    }
}