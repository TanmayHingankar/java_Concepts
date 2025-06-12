public class hello {

    public static void main(String[] args) {
        int num1 = 9;        // Integer (4 bytes, range: -2³¹ to 2³¹-1)
        byte by = 127;        // Byte (1 byte, range: -128 to 127)
        short sh = 558;       // Short (2 bytes, range: -32,768 to 32,767)
        long l = 5854l;       // Long (8 bytes, suffix 'L' or 'l' for long)
        
        float f = 5.8f;       // Float (4 bytes, suffix 'F' or 'f' required) and 7 decimal digits precision and if you want to use folat you had to mention the f ,,,beacause it is default is double
        double d = 5.8;       // Double (8 bytes, default for decimals) and 15 decimal digits precision (default)
        
        char c = 'k';         // Char (2 bytes, Unicode character)
        
        boolean b = true;     // Boolean (true/false, size JVM-dependent)

      long globalPopulation = 7_900_000_000L; // Large numbers (note underscore readability)  gives output without underscire 
    }
}

    Primitive vs Non-Primitive

        Primitive: Stored in stack memory, faster access.

        Non-Primitive: Stored in heap memory, accessed via references.

    Default Values

        Primitives have defaults (e.g., 0, 0.0, false).

        Non-primitives default to null.

    Common Pitfalls

        float f = 3.14; → Error (needs f suffix).

        long l = 10000000000; → Error (needs L suffix).

      
Primitive Data Types in Java
      
Data Type	Size (Bytes)	Range/Values	Default Value	Example
byte	1	-128 to 127	0	byte b = 100;
short	2	-32,768 to 32,767	0	short s = 5000;
int	4	-2³¹ to 2³¹-1	0	int num = 42;
long	8	-2⁶³ to 2⁶³-1	0L	long bigNum = 100000L;
float	4	~6-7 decimal digits	0.0f	float pi = 3.14f;
double	8	~15 decimal digits	0.0d	double precise = 9.87654321;
char	2	Unicode (0 to 65,535)	'\u0000'	char ch = 'A';
boolean	JVM-dependent	true/false	false	boolean flag = true;

Non primitive Datatypes : Arrays , class , interfaces , enum , string 
  
