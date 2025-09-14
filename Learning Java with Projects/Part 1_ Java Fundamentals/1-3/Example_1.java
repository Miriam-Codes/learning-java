public class Example_1 {
    public static void main(String[] args) {
        // Declare boolean variables
        boolean b1 = false;
        boolean b2;
        boolean b3;

        // Assign b1's value to b2, then b2's value to b3 (chained assignment)
        b3 = b2 = b1;

        // Print the values of b1, b2, and b3
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}