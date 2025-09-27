public class Operators {
    public static void main(String[] args){
        int a =10, b = 5, c;

          // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b)); //Remainder

        // 2. Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a));  // pre-increment
        System.out.println("a-- = " + (a--));  // post-decrement
        System.out.println("-b = " + (-b));    // negation - sign bit flip
        System.out.println("~b = " + (~b));    // bitwise NOT - flips all bits
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

        // 4. Logical Operators (true or false)
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y)); //true if both are true (multiplication)
        System.out.println("x || y = " + (x || y)); //true if at least one is true (addition)
        System.out.println("!x = " + (!x)); //flips the value (true → false, false → true)

        // 5. Bitwise Operators(bitwise)
        System.out.println("\nBitwise Operators:");
        int p = 6, q = 3; // 6 = 110, 3 = 011
        System.out.println("p & q = " + (p & q));  // AND Result bit = 1 only if both bits are 1.
        System.out.println("p | q = " + (p | q));  // OR Result bit = 1 if at least one bit is 1.
        System.out.println("p ^ q = " + (p ^ q));  // XOR Result bit = 1 if bits are different, 0 if same.
        System.out.println("p << 1 = " + (p << 1));// Left shift Shifts all bits to the left by given positions.Each left shift = multiply by 2
        System.out.println("p >> 1 = " + (p >> 1));// Right shift Shifts all bits to the right, keeping the sign bit.Each right shift = divide by 2.
        System.out.println("p >>> 1 = " + (p >>> 1));// Unsigned right shift Shifts all bits to the right, filling with 0 (ignores sign).

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

    }
}
