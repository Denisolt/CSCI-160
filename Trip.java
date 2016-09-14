//Denisolt Shakhbulatov
//24.11.2015
import java.util.ArrayList;
public class Trip
{
    private ArrayList<Flight> flights;

    public Trip() 
    {
        flights = new ArrayList<Flight>();
    }

    public void addNext(Flight myFlight) 
    {
        flights.add(myFlight);
    }

    public int getDuration()
    { 
        if (flights.size() == 0)
        {
            return 0;
        }
        else 
        {
            Time start = flights.get(0).getDepartureTime();
            Time end = flights.get(flights.size()-1).getArrivalTime();
            return start.minutesUntil(end);
        }
    }

    public int getShortestLayover()
    {
        Time start = flights.get(0).getArrivalTime();
        Time end = flights.get(0+1).getDepartureTime();
        int min = start.minutesUntil(end);
        for(int i=0; i<flights.size()-1; i++)
        {
            start = flights.get(i).getArrivalTime();
            end = flights.get(i+1).getDepartureTime();
            if(flights.size() < 2)
            {
                return -1;
            }
            else if (min > start.minutesUntil(end))
            {                
                min = start.minutesUntil(end);
                return min;
            }
        }
        return min;
    }
}
