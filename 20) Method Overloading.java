// 👇 Class Calculator demonstrating Method Overloading
class Calculator
{
    // Method 1: add 3 integers
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3; // returns sum of 3 integers
    }

    // Method 2: add 2 integers
    public int add(int n1, int n2) {
        return n1 + n2; // returns sum of 2 integers
    }

    // Method 3: add a double and an int
    public double add(double n1, int n2) {
        return n1 + n2; // returns sum of double and int
    }
}


// 👇 Main class with main method
public class Demo {
    public static void main(String[] args) {
        
        Calculator obj = new Calculator();      // ✅ Object created

        int r1 = obj.add(3, 4);                 // ✅ Matches method with 2 int parameters
        System.out.println(r1);                 // ✅ Output: 7
    }
}


📘 INTERVIEW THEORY NOTES: METHOD OVERLOADING
🔹 What is Method Overloading?

Definition:

    Method Overloading means having multiple methods with the same name but different parameter lists (number/type/order of parameters) in the same class.

✅ Example:

int add(int a, int b)
int add(int a, int b, int c)
double add(double a, int b)

👆 All are valid overloaded methods because they differ in parameter type/count.

  🔹 Rules of Method Overloading:
Rule	Explanation
✅ Method name	Should be same
✅ Parameter list	Must be different (type, number, or order)
❌ Return type only	Changing only return type is not valid for overloading

  🔹 Why use Method Overloading?
Reason	Explanation
✔️ Readability	Same method name for similar operations
✔️ Flexibility	Can handle different inputs
✔️ Clean Code	Reduces method name clutter
🔹 Memory Concept:

    All overloaded methods are stored separately in memory by the compiler.

    At compile time, Java decides which method to call based on the arguments passed → this is called Compile-Time Polymorphism.

✅ INTERVIEW FAQs on Overloading

 Question	Best Answer
What is method overloading?	Defining multiple methods with same name but different parameter list in the same class.
Can you overload a method by changing only return type?	No, return type alone cannot distinguish overloaded methods.
What is the benefit of method overloading?	Improves code readability and reusability.
Is method overloading compile-time or runtime polymorphism?	It is compile-time polymorphism (aka static binding).

  ✅ Real-Life Example:

Java Concept	Real Life Analogy
Method Overloading	Calculator with "Add" button: you can add 2 or 3 numbers, float or int, but it’s still called “Add”.
