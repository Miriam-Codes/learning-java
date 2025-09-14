public class Example_4 {
    public static void main(String[] args) {
        // * has higher precedence than +, so 2 * 4 is calculated first → 3 + 8 = 11
        int res = 3 + 2 * 4;
        System.out.println(res); // 11

        // Parentheses change the order of operations → (3 + 2) * 4 = 20
        res = (3 + 2) * 4;
        System.out.println(res); // 20

        // + and - are evaluated left to right → (6 + 4) - 2 = 8
        res = 6 + 4 - 2;
        System.out.println(res); // 8

        // *, /, and % are also evaluated left to right
        // 10 / 4 = 2 → 2 * 6 = 12 → 12 % 10 = 2
        res = 10 / 4 * 6 % 10;
        System.out.println(res); // 2
    }
}
