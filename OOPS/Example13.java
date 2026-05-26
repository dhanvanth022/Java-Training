

// In Java, polymorphism means “one name, many forms.”
// It allows a method or object to behave differently depending on context.

// Compile-Time Polymorphism (Method Overloading)

// Same method name, but different parameters.


class Calculator {

    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Example13 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(2, 3));
        System.out.println(c.add(1, 2, 3));
        
    }
}
