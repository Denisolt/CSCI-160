public class Trail_Driver
{
    public static void main()
    {
        int [] trail_points = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        Trail myTrail = new Trail(trail_points);
        
        boolean isLevel=myTrail.isLevelTrailSegment(7,10);   //75, 75, 70, 80
        System.out.println("Segment(7-10) isLevel is "+isLevel); // Should return true
        
        isLevel=myTrail.isLevelTrailSegment(2,12);   //105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100
        System.out.println("Segment(2-12) isLevel is "+isLevel); // Should return false
        
        boolean isDifficult=myTrail.isDifficult();
        System.out.println("Trail is difficult is "+isDifficult);
        
        // Challenge: Modify isDifficult to take (similar to isLevelTraiSegment) a starting and ending index.
        // then show that it works (one case to return true and another to return false)
    }
}
