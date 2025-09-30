public class Exercise1v10 {
    public static void main (String[]args){
        final double KILOMETERSTOMILES = 1.6;
        final double SECONDSTOHOURS = 3600;
        final double MINUTESTOHOURS = 60;

        //CONVERT KILOMETER TO MILE
        double miles = 15 / KILOMETERSTOMILES;

        //convert minutes and seconds to hour
        double time = (50.0 /MINUTESTOHOURS ) + (30.0 /SECONDSTOHOURS);
        //SPEED = DISTANCE / TIME
        double speed = miles / time;

        System.out.println("Average speed in miles per hour: " + speed + "mph");
    }
    
}
