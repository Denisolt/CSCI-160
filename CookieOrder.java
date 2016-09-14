import java.util.ArrayList;
public class CookieOrder
{
    private String variety;
    private int numBoxes;
    /** Constructs a new CookieOrder object. */
    public CookieOrder(String var, int num)
    {
        variety = var;
        numBoxes = num;
        /* implementation not shown */ 
    }

    /** @return the variety of cookie being ordered
     */
    public String getVariety()
    {
        return variety;
        /* implementation not shown */ 
    }

    /** @return the number of boxes being ordered
     */
    public int getNumBoxes()
    {       
        return numBoxes;
        /* implementation not shown */ 
    }

    // There may be instance variables, constructors, and methods that are not shown.
}