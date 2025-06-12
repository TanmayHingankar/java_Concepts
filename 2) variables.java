public class hello {

    public static void main(String[] args) {
        System.out.print(3+5);       // Output: 8 (no newline)
        System.out.print(8+7);       // Output: 815 (concatenated with previous output)
        
        // Better version with variables:
        int num1 = 3;                // Declare and initialize num1
        int num2 = 5;                // Declare and initialize num2
        int result = num1 + num2;    // Store sum in result variable
        System.out.println(result);  // Output: 8 (with newline)
        
        // Additional examples:
        int a = 10, b = 20;          // Multiple declaration
        final double PI = 3.14;      // Constant variable
        System.out.println(a + b);   // Output: 30
    }
}

Variable-Related Theory for Interviews:

    What is a variable?

        A variable is a named memory location that stores data of a specific type, whose value can change during program execution.

    Variable Declaration vs Initialization

        Declaration: int x; (just declaring the type)

        Initialization: x = 10; (assigning a value)

        Can be combined: int x = 10;

    Variable Naming Rules

        Must start with letter, $, or _

        Can contain letters, digits, $, _

        Cannot be Java keywords

        Case-sensitive

        Follow camelCase convention (e.g., studentCount)

    Variable Types

        Local variables (declared inside methods)

        Instance variables (declared in class, outside methods)

        Static variables (declared with static keyword)

    Variable Scope

        Local: Only within the block/method where declared

        Instance: Throughout the class (for each object)

        Static: Throughout the class (shared by all objects)

    Final Variables

        Declared with final keyword

        Value cannot be changed after initialization

        Naming convention: ALL_CAPS (e.g., MAX_SIZE)

    Type Casting

        Widening (automatic): int to double

        Narrowing (manual): double to int (requires explicit cast)

    Best Practices

        Use meaningful names

        Initialize variables before use

        Declare variables close to their usage

        Minimize variable scope

        Use final for constants

    Memory Allocation

        Primitive types: Stored in stack memory

        Object references: Reference in stack, object in heap

    Default Values

        Instance variables: Default values (0, false, null)

        Local variables: No default value (must be initialized)
