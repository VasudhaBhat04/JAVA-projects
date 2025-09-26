public class Operators {
    public static void main(String[] args){
        int a =10, b = 5, c;

          // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a));  // pre-increment
        System.out.println("a-- = " + (a--));  // post-decrement
        System.out.println("-b = " + (-b));    // negation
        System.out.println("~b = " + (~b));    // bitwise NOT
        boolean flag = true;
        System.out.println("!flag = " + (!flag));

        // 3. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        // 4. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // 5. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int p = 6, q = 3; // 6 = 110, 3 = 011
        System.out.println("p & q = " + (p & q));  // AND
        System.out.println("p | q = " + (p | q));  // OR
        System.out.println("p ^ q = " + (p ^ q));  // XOR
        System.out.println("p << 1 = " + (p << 1));// Left shift
        System.out.println("p >> 1 = " + (p >> 1));// Right shift
        System.out.println("p >>> 1 = " + (p >>> 1));// Unsigned right shift

        // 6. Assignment Operators
        System.out.println("\nAssignment Operators:");
        c = a; // simple assignment
        System.out.println("c = " + c);
        c += b; // c = c + b
        System.out.println("c += b → " + c);
        c -= b;
        System.out.println("c -= b → " + c);
        c *= b;
        System.out.println("c *= b → " + c);
        c /= b;
        System.out.println("c /= b → " + c);
        c %= b;
        System.out.println("c %= b → " + c);

        // 7. Conditional (Ternary) Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);

        // 8. Instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));



















    }
}
