public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting);

        int number = 5;
        int doubled = doubleNumber(number);
        System.out.println("The doubled number is: " + doubled);
    }

    // This is a custom method that takes an int as input and returns double its
    // value
    public static int doubleNumber(int input) {
        return input * 2;
    }
}
