//Denisolt Shakhbulatov
//11.10.2015
public class Trail
{
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;

    public Trail(int [] segments)
    {
        markers = segments;
    }

    /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
     * an ending marker, and all markers between those two markers.
     * A trail segment is level if it has a difference between the maximum elevation
     * and minimum elevation that is less than or equal to 10 meters.
     * @param start the index of the starting marker
     * @param end the index of the ending marker
     * Precondition: 0 <= start < end <= markers.length - 1
     * @return true if the difference between the maximum and minimum
     * elevation on this segment of the trail is less than or equal to 10 meters;
     * false otherwise.
     */
    public boolean isLevelTrailSegment(int start, int end)
    { 
        int highest = markers[end];
        int lowest = markers[start];
        for (int i=start; i<=end; i++)
        {
            if (markers[i]>highest)
                highest = markers[i];
        }

        for (int i=start; i<=end; i++)
        {
            if (markers[i]<lowest)
                lowest = markers[i];
        }

        if((highest-lowest)<=10)
            return true;
        else
            return false; // replace with your code
    }

    /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
     * elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
     * with 3 or more such changes is rated difficult.
     * @return true if the trail is rated difficult; false otherwise.
     */
    public boolean isDifficult()
    { 
        int answer = markers[0];
        for(int i = markers[0]; i<markers.length;i++)
        {   if(markers[i]<markers[i+1])
            {
                answer = answer + markers[i];
            }
            else if(markers[i]>markers[i+1])
            {   
                answer = answer - markers[i];
            }
        }
        if(answer>=30)
            return true;
        else
            return false; // replace with your code
    }
    // There may be instance variables, constructors, and methods that are not shown.
}