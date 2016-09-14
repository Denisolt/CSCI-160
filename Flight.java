//Denisolt Shakhbulatov
//24.11.2015
import java.util.ArrayList;
public class Flight
{
    private Time departTime;
    private Time arrivalTime;
    public Flight(Time start, Time end)
    {
        departTime = start;
        arrivalTime = end;
    }

    public Time getDepartureTime()
    {
        return departTime;
    }

    public Time getArrivalTime()
    { 
        return arrivalTime;
    }
}