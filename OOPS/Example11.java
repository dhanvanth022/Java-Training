// Multiple Inheritance (via Interfaces) : Java does NOT support multiple inheritance with classes (to avoid ambiguity), but supports it using interfaces.

interface A {
    void show();
}
interface B  {
    void display();
}

class Test implements A, B{
    public void show(){
        System.out.println("Interface A methgod");
    }

    public void display(){
        System.out.println("Interface B method");
    }
}


public class Example11 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }
}
