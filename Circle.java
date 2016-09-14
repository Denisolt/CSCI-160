public class Circle
{
    private String color;
    private double radius;
    public Circle()
    {
        
    }
    public Circle( double r, String c)
    {
        radius = r;
        color = c;
    }
    public double getRadius()
    {
        return radius;
    }
    public String getColor()
    {
        return color;
    }
    public double getArea()
    {
        double area = radius * 2 * 3.14;
        return area;
    }
    public void setRadius( double r)
    {
        radius = r;
    }
    public void setColor(String c)
    {
        color = c;
    }
}