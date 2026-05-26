// multilevel inhertence : A class inherits from a class, which itself inherits from another class.

// a -> b -> c

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}


public class example9 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
