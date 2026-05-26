class Example5 {
    String name;
    int age;

    // Normal constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 20);

        // Using copy constructor
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}