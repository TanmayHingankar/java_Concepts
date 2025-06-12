public class LiteralsDemo {
    public static void main(String[] args) {
        int num1 = 0b101;         // Binary literal (0b prefix), Output: 5
        System.out.println(num1);
        
        int num2 = 0x7E;          // Hexadecimal literal (0x prefix), Output: 126
        System.out.println(num2);
        
        int num3 = 10_00_00_000;  // Underscore in numeric literal, Output: 100000000
        System.out.println(num3);
        
        float num4 = 56;          // Integer literal auto-converted to float, Output: 56.0
        System.out.println(num4);
        
        double num5 = 56;         // Integer literal auto-converted to double, Output: 56.0
        System.out.println(num5);
        
        double num6 = 12e10;      // Scientific notation, Output: 1.2E11 (12 * 10^10)
        System.out.println(num6);
        
        // boolean num7 = 1;      // ERROR: Java booleans only accept true/false
        boolean num7 = true;      // Correct boolean literal, Output: true
        System.out.println(num7);
        
        char c = 'a';             // Character literal, Output: a
        System.out.println(c);
        c++;                      // Increments ASCII value ('a' → 'b')
        
        char c1 = 'a';            // Character literal, Output: a
        c1++;                     // Increments ASCII value ('a' → 'b')
        System.out.println(c1);    // Output: b
    }
}


Literals Theory for Interviews
1. What is a Literal?

A literal is a fixed value directly written in code (e.g., 42, 'A', true).
  
2. Types of Literals in Java
  
Literal Type	Examples	Rules
  
Integer	42, 0b1010, 0x1A3F	Can use binary (0b), octal (0), hex (0x), underscores (1_000).
Floating-Point	3.14f, 6.022e23	float needs f suffix. Scientific notation allowed.
Character	'A', '\n', '\u0041'	Single quotes, supports escape sequences and Unicode.
String	"Hello", "Line\nBreak"	Double quotes, immutable.
Boolean	true, false	Only these two values.
Null	null	For object references.
