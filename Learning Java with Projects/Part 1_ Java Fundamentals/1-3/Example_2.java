public class Example_2 {
    public static void main(String[] args) {
        // Declare variable x and increment it by 1 (pre-increment)
        int x = 3;
        ++x;

        // Print x and x++ to demonstrate post-increment behavior
        System.out.println(x); // 4
        System.out.println(x++); // 4 (x is printed first, then incrememnted)
        System.out.println(x); // 5 (value stays 5)

        // Declare variable y and decrement it by 1 (pre-decrement)
        int y = 4;
        --y;

        // Print y and --y to demonstrate pre-decrement behavior
        System.out.println(y); // 3
        System.out.println(--y); // 2 (y is decremented first, then printed)
        System.out.println(y); // 2 (value stays 2)
    }
}
