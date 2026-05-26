// Runtime Polymorphism (Method Overriding) : Parent and child classes both contans the same function with a diffrent defintions.

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}


public class Example14 {
     public static void main(String[] args) {

        Animal a;   // reference of parent class

        a = new Dog();
        a.sound();  // calls Dog's method

        a = new Cat();
        a.sound();  // calls Cat's method
}
}