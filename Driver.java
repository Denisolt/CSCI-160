//Denisolt Shakhbulatov
//24.11.2015
public class Driver 
{	
    public static void main ( String [] args )   
    {
        Time DepartTime1 = new Time(1130);
        Time ArrivalTime1 = new Time(1215);
        Flight myFlight1 = new Flight(DepartTime1, ArrivalTime1); 

        Time DepartTime2 = new Time(1315);
        Time ArrivalTime2 = new Time(1545);
        Flight myFlight2 = new Flight(DepartTime2, ArrivalTime2);

        Time DepartTime3 = new Time(1600);
        Time ArrivalTime3 = new Time(1845);
        Flight myFlight3 = new Flight(DepartTime3, ArrivalTime3);

        Time DepartTime4 = new Time(2215);
        Time ArrivalTime4 = new Time(2300);
        Flight myFlight4 = new Flight(DepartTime4, ArrivalTime4);

        Trip myTrip = new Trip();

        myTrip.addNext(myFlight1);
        myTrip.addNext(myFlight2);
        myTrip.addNext(myFlight3);
        myTrip.addNext(myFlight4);

        System.out.println("Flight time is " + DepartTime1.minutesUntil(ArrivalTime1) + " minutes.");
        System.out.println("Layover time is " + ArrivalTime1.minutesUntil(DepartTime2) + " minutes.");
        System.out.println();

        System.out.println("Flight time is " + DepartTime2.minutesUntil(ArrivalTime2) + " minutes.");
        System.out.println("Layover time is " + ArrivalTime2.minutesUntil(DepartTime3) + " minutes.");
        System.out.println();

        System.out.println("Flight time is " + DepartTime3.minutesUntil(ArrivalTime3) + " minutes.");
        System.out.println("Layover time is " + ArrivalTime3.minutesUntil(DepartTime4) + " minutes.");
        System.out.println();

        System.out.println("Flight time is " + DepartTime4.minutesUntil(ArrivalTime4) + " minutes.");
        System.out.println();

        int totalFlightTime = DepartTime1.minutesUntil(ArrivalTime1) 
                            + DepartTime2.minutesUntil(ArrivalTime2) 
                            + DepartTime3.minutesUntil(ArrivalTime3) 
                            + DepartTime4.minutesUntil(ArrivalTime4);
        System.out.println("Shortest layover is " + myTrip.getShortestLayover() + " minutes.");
        System.out.println("Trip duration is " + myTrip.getDuration() + " minutes.");
        System.out.println("The total Flight time is " + totalFlightTime + " minutes.");
    }
}
