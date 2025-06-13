public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        byte b = 127;       // byte range: -128 to 127
        int a = b;          // auto-casting byte → int (no data loss)
        System.out.println(b); // Output: 127
        System.out.println(a); // Output: 127

        byte b1 = 125;      // Within byte range
        int a0 = b1;        // auto-casting byte → int
        System.out.println(b1); // Output: 125
        System.out.println(a0); // Output: 125

        // Explicit Casting (Narrowing)
        int aa = 257;       // 257 is beyond byte range (-128 to 127)
        byte k = (byte)aa;  // Explicit cast → truncation occurs (257 % 256 = 1)
        System.out.println(k); // Output: 1

        float f = 5.6f;     // Floating-point number
        int t = (int)f;     // Explicit cast → truncates decimal part
        System.out.println(t); // Output: 5

        int a2 = 2567;      // Beyond byte range
        byte b2 = (byte)a2; // Explicit cast → 2567 % 256 = 7 (since 2560/256=10, remainder 7)
        System.out.println(b2); // Output: 7

        // Arithmetic Operations
        byte a3 = 10;
        byte b4 = 20;
        int result = a3 * b4; // byte*byte → auto-promoted to int
        System.out.println(result); // Output: 200
    }
}

Type Casting & Literals Theory for Interviews
1. Type Casting Basics
Concept	Example	Rule
Implicit Cast	  int a = b;  (b is byte)	Automatically happens when converting smaller→larger type (no data loss).
Explicit Cast	  byte b = (byte)a; 	Required for larger→smaller types (may cause data loss/overflow).


Literals in Java
  
Literal    Type	                     Examples	                 Key Points
Integer	 42, 0b1010, 0x1A	   Default type is int.             Use L for long (e.g., 10000000000L).
Floating	3.14f, 2.718	   Default type is double.            Use f for float (e.g., 3.14f).
Character	'A', '\n'	       Single quotes, supports            Unicode ('\u0041' = 'A').
Boolean	 true, false	                                          Only these two values allowed.

Key Interview Questions
Q1. What happens when casting double to int?

Answer: The decimal part is truncated (not rounded).
Example:
java

double d = 9.99;
int i = (int)d;  // i = 9

Q2. Why does byte b = 130; fail?

Answer: byte range is -128 to 127. Use explicit cast, but it overflows:
java

byte b = (byte)130;  // b = -126 (130 - 256)

Q3. What is auto-promotion in arithmetic?

Answer: Java promotes byte, short, char to int before operations:
java

byte a = 10, b = 20;
int c = a * b;  // Required! byte*byte → int

Q4. How to avoid overflow in casting?

Answer: Check ranges before casting:
java

int large = 200;
if (large >= Byte.MIN_VALUE && large <= Byte.MAX_VALUE) {
    byte safe = (byte)large;
}

Q5. Difference between 5 and 5.0?

Answer:

    5 → int literal.

    5.0 → double literal.


