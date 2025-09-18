public class Exercise1v7 {
    public static void main(String[] args) {
        // remember if you use an int to divide it will just give 0 not the decimal
        double calc1 = (4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        double calc2 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));

        System.out.println("π = " + calc1);
        System.out.println("π = " + calc2);

    }
}