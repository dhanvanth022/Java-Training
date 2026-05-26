// Hybrid Inheritance : Combination of two or more types of inheritance (achieved using interfaces in Java).


interface Animal {
    void eat();
}

class Dog{
    void bark(){
        System.out.println("Barking...");
    }
}

class Puppy extends Dog implements Animal{
    public void eat(){
        System.out.println("Eating...");
    }

    void weep(){
        System.out.println("Weeping...");
    }
}



public class Example12 {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.bark();
        p.eat();
        p.weep();
    }
}
