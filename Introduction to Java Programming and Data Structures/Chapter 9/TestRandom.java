import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random r1 = new Random(1000);

        for (int i = 0; i < 50; i++) {
            if (i < 49) {
                System.out.print(r1.nextInt(101) + ", ");
            } else {
                System.out.print(r1.nextInt(101));

            }

        }

    }

}
