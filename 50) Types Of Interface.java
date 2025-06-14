# **Functional Interfaces in Java - Complete Guide**  

## **1. What is a Functional Interface?**  
**Definition**: An interface with **exactly one abstract method** (SAM).  

### **Why Use Functional Interfaces?**  
✔ **Enable Lambda Expressions**  
✔ **Simplify Code** (Less boilerplate)  
✔ **Support Functional Programming**  

---

## **2. @FunctionalInterface Annotation**  
- Ensures the interface has **only one abstract method**.  
- Optional but **recommended** for clarity.  

```java
@FunctionalInterface
interface A {
    void show();  // Single Abstract Method (SAM)
    // void run();  // ❌ Compile error if uncommented (breaks FI rule)
}
```

---

## **3. Your Code Explained (Line-by-Line)**  

```java
@FunctionalInterface
interface A {
    void show();  // SAM (Single Abstract Method)
}

public class Demo {
    public static void main(String[] args) {
        // Anonymous class implementation
        A obj = new A() {  // Traditional way (before Java 8)
            @Override
            public void show() {
                System.out.println("in Show");  // Output when show() is called
            }
        };
        obj.show();  // Output: "in Show"
    }
}
```
**Key Points**:  
- `@FunctionalInterface` restricts `A` to **one abstract method**.  
- Anonymous class (`new A() {...}`) is replaced by **lambdas** in modern Java.  

---

## **4. Lambda Expression Equivalent**  
```java
@FunctionalInterface
interface A {
    void show();
}

public class Demo {
    public static void main(String[] args) {
        // Lambda version (Java 8+)
        A obj = () -> System.out.println("in Show");  // Same output
        obj.show();  // Output: "in Show"
    }
}
```

---

## **5. Built-in Functional Interfaces**  
Java provides common FIs in `java.util.function`:  

| Interface | Method | Use Case |
|-----------|--------|----------|
| `Predicate<T>` | `boolean test(T t)` | Filtering (e.g., `list.stream().filter(x -> x > 5)`) |
| `Function<T,R>` | `R apply(T t)` | Transformations (e.g., `String::length`) |
| `Consumer<T>` | `void accept(T t)` | Side effects (e.g., `System.out::println`) |
| `Supplier<T>` | `T get()` | Lazy generation (e.g., `LocalDate::now`) |

**Example**:  
```java
Predicate<Integer> isEven = n -> n % 2 == 0;
System.out.println(isEven.test(4));  // Output: true
```

---

## **6. Interview Questions & Answers**  

### **Q1: Can a functional interface have default methods?**  
✅ **Yes!** As long as it has **only one abstract method**.  

### **Q2: Difference between `@FunctionalInterface` and regular interface?**  
| `@FunctionalInterface` | Regular Interface |  
|------------------------|-------------------|  
| **1 abstract method** | Any number of methods |  
| **Enforced by compiler** | No restrictions |  
| **Lambda compatible** | Not necessarily |  

### **Q3: Can functional interfaces extend other interfaces?**  
✅ **Yes!** If the parent has **no abstract methods** (e.g., only defaults).  

### **Q4: What happens if we add a second abstract method?**  
❌ **Compile error**: "Invalid '@FunctionalInterface' annotation".  

### **Q5: Where are functional interfaces used in real projects?**  
✔ **Streams API** (`filter`, `map`, `forEach`)  
✔ **Threading** (`Runnable`, `Callable`)  
✔ **GUI events** (Button click handlers)  

---

## **7. Key Takeaways**  
✔ **Single Abstract Method (SAM)** = Functional Interface  
✔ **`@FunctionalInterface`** enforces the rule  
✔ **Lambdas** replace anonymous classes  
✔ **`java.util.function`** has common FIs  

M
