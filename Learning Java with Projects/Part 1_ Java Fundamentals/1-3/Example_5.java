public class Example_5 {
    public static void main(String[] args) {
        // Integer addition
        int a = 3, b = 2;
        int res = a + b;
        System.out.println(res); // 5

        // Demonstrating string concatenation with integers
        String s = "abc";

        // When the number comes first, it's converted to a string then combined →
        // "3abc"
        String s1 = a + s;

        // When the string comes first, it's combined directly → "abc3"
        String s2 = s + a;

        System.out.println(s1 + " " + s2); // Output: "3abc abc3"

        // Without parentheses: evaluated left to right
        // "Output is " + a → "Output is 3", then + b → "Output is 32"
        System.out.println("Output is " + a + b); // "Output is 32"

        // With parentheses: a + b is evaluated first, then concatenated → "Output is 5"
        System.out.println("Output is " + (a + b)); // "Output is 5"
    }
}
/*
 * 🔹 Printing numbers with strings in Java 🔹
 *
 * RULE:
 * If a string comes first in a println statement,
 * everything after it will be treated as STRING CONCATENATION,
 * unless you use parentheses OR do the math before printing.
 *
 * -----------------------------------------
 * 1️⃣ Using parentheses inside println:
 *
 * System.out.println("Output is " + (a + b));
 * → Math happens first → "Output is 5"
 *
 * -----------------------------------------
 * 2️⃣ Doing the math outside first:
 *
 * int sum = a + b;
 * System.out.println("Output is " + sum);
 * → Cleaner for bigger or reused calculations.
 *
 * -----------------------------------------
 * ❌ WRONG way:
 *
 * System.out.println("Output is " + a + b);
 * → "Output is 3" + b → "Output is 32"
 * → Final output is WRONG.
 *
 * -----------------------------------------
 * GOLDEN RULE 😏:
 * - Simple math? → Use parentheses inside println.
 * - Complex math or reused result? → Do math first, store in a variable, then print.
 */
