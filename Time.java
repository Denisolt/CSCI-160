//Denisolt Shakhbulatov
//24.11.2015
public class Time
{
    private int hhmm;
    /** Constructor 
     *  @param HHMM military time hhmm
     */ 
    public Time(int HHMM)
    {
        hhmm=HHMM;
    }

    /** @return difference, in minutes, between this time and other;
     * difference is negative if other is earlier than this time
     */
    public int minutesUntil(Time time)
    { /* implementation not shown */
        int time1, time2;
        time1=hhmm;
        time2=time.getHhmm();
        int t1 = (time1 / 100) * 60 + (time1 % 100);
        int t2 = (time2 / 100) * 60 + (time2 % 100);

        int min = t2 - t1;
        return min;
    }

    /** @return the time as int */
    public int getHhmm()
    {
        return hhmm;
    }
}
