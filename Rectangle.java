//Denisolt Shakhbulatov
//10.22.2015
/* ______________________________
 * +        Rectangle           +
 * +____________________________+
 * +      -width:double         +
 * +      -length:double        +
 * +____________________________+
 * + +setLength(len:double):void+
 * +   +setWidth(w:double):void +
 * +    +getLength():double     +
 * +    +getWidth():double      +
 * +    +getArea():double       +
 * +____________________________+
 */
public class Rectangle
{
    private double length;
    private double width;
    public void setLength(double len)
    {
        length = len;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public double getLength(double len)
    {
        return length;
    }

    public double getWidth(double w)
    {
        return width;
    }

    public double getArea()
    {
        return length*width;
    }
}