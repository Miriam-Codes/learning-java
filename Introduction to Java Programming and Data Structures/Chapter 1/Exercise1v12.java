public class Exercise1v12 {
    public static void main(String[] args) {
        final double MILESTOKILOMETERS = 1.6;
        final double SECONDSTOHOURS = 3600;
        final double MINUTESTOHOURS = 60;

        // convert kilometer to mile
        double kilometers = 15 * MILESTOKILOMETERS;

        // convert minutes and seconds to hour
        double time = 1 + (40.0 / MINUTESTOHOURS) + (35.0 / SECONDSTOHOURS);
        // SPEED = DISTANCE / TIME
        double speed = kilometers / time;

        System.out.println("Average speed in kilometers per hour: " + speed + "kmph");
    }

}
