✅ **Tanmay Bhai – Here's your updated Java code with line-by-line comments and output explanation**, perfect for your **revision notes + interviews** 👇

---

### ✅ **Updated & Explained Code with Output Comments**

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {   	

        // 📌 Method 1: Read using System.in.read() [reads one byte only]
//    	System.out.println("Enter a number");
//    	int num = System.in.read();        // Suppose input: 5 → it reads ASCII = 53
//    	System.out.println(num);           // Output: 53 (ASCII of '5')
//    	System.out.println(num - 48);      // Output: 5 (convert char → int)

        System.out.println("Enter a number");  // Output: Enter a number

        // 📌 Method 2: BufferedReader [reads a full line as String]
//    	InputStreamReader in = new InputStreamReader(System.in); // Converts byte → char stream
//    	BufferedReader bf = new BufferedReader(in);               // Buffered wrapper for performance
//    	int num = Integer.parseInt(bf.readLine());                // Reads a line, parses to int
//    	System.out.println(num);                                  // Output: input number

        // 📌 Method 3: Scanner (most common, easy)
        Scanner sc = new Scanner(System.in);       // Create Scanner object
        int num = sc.nextInt();                    // Reads int input
        System.out.println(num);                   // Output: input number
    }
}
```

---

### ✅ **Output (if input is `5`)**

```
Enter a number
5
5
```

---

### ✅ Summary: Input Methods in Java

| Method             | Input Type       | Returns    | Requires Exception Handling? | Notes                      |
| ------------------ | ---------------- | ---------- | ---------------------------- | -------------------------- |
| `System.in.read()` | 1 byte           | `int`      | Yes                          | Returns ASCII, needs `-48` |
| `BufferedReader`   | Full Line        | `String`   | Yes                          | Fast, more control         |
| `Scanner`          | Token (e.g. int) | int/String | No                           | Easy and widely used       |

---

### 📘 **Interview Notes: Scanner vs BufferedReader**

| Feature   | Scanner                           | BufferedReader             |
| --------- | --------------------------------- | -------------------------- |
| Type      | Token-based                       | Line-based                 |
| Speed     | Slower                            | Faster                     |
| Exception | No `throws` needed                | Needs `throws IOException` |
| Parsing   | Built-in methods like `nextInt()` | Needs manual parsing       |
| Use Case  | Simple CLI input                  | File reading, performance  |

