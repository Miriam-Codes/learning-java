import java.util.Date;

public class TestDate {
    static long[] elapsedTimes = { 10000l, 100000l, 1000000l, 10000000l, 100000000l, 1000000000l,
            10000000000l, 100000000000l };

    public static void main(String[] args) {
        for (long time : elapsedTimes) {
            Date d1 = new Date(time);
            System.out.println("Elapsed Milliseconds: " + d1);

        }

    }
}
