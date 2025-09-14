public class Example_3 {
    public static void main(String[] args) {
        // Unary plus (+) has no effect, so x stays 6
        int x = +6;

        // Unary minus (-) flips the sign of x, making y = -6
        int y = -x;

        // Print values of x and y
        System.out.println(x); // 6
        System.out.println(y); // -6

        // Casting a decimal (double) to an int removes the decimal part (truncates)
        int z = (int) 3.45;
        System.out.println(z); // 3

        // Logical NOT (!) inverts a boolean value
        boolean b = true;
        System.out.println(!b); // false (true becomes false)
        System.out.println(b); // true (original value remains unchanged)
    }
}
