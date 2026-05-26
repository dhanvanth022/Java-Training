//Constructor : A constructor in Java is a special method that is used to initialize objects.

// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes
//constructor have the same name as class 
//constructor dont have a return typr.(not even void)
//constructor are only called once , at object created.
//Memory allocation happens when constructor is called.
//Basic structure of constructor
public class Example4 {

    public static void main(String[] args) {
        Student s1 = new Student("Dhanvanth"); //constructor called
        System.out.println(s1.name);
    }

}

class Student {

    String name;
    int roll;

    Student(String name) {
        //Constructor
        this.name = name;
    }

}
